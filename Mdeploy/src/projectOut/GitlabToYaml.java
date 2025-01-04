package projectOut;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import gitlab.*;

public class GitlabToYaml {
	public static void main(String[] args) {
		// Register GitLab package
        GitlabPackage.eINSTANCE.eClass();
		
        // Initialize EMF
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("model", new XMIResourceFactoryImpl());
        
        // Load model
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(
            URI.createFileURI("src/m2mTransformation/gitlab.model"), true);
        
        Pipeline pipeline = (Pipeline) resource.getContents().get(0);
        
        // Transform
        GitlabToYaml.transform(pipeline, "src/projectOut/gitlab-ci.yml");
    }
    
    public static void transform(Pipeline pipeline, String outputPath) {
        Map<String, Object> yamlMap = new LinkedHashMap<>();
        
        // Pipeline name
        yamlMap.put("# Pipeline", pipeline.getName());
        
        // Triggers
        for (Trigger trigger : pipeline.getTriggers()) {
            Map<String, Object> triggerMap = new LinkedHashMap<>();
            triggerMap.put("trigger", Collections.singletonList(trigger.getCondition()));
            yamlMap.put(trigger.getName(), triggerMap);
        }
        
        // Sort stages by order
        List<Stage> stages = new ArrayList<>(pipeline.getStages());
        Collections.sort(stages, (a, b) -> Integer.compare(a.getOrder(), b.getOrder()));
        
        // Process stages
        for (Stage stage : stages) {
            String stageName = getStageType(stage).toLowerCase() + "_stage";
            Map<String, Object> stageMap = new LinkedHashMap<>();
            
            stageMap.put("stage", getStageType(stage).toLowerCase());
            List<String> scripts = new ArrayList<>();
            scripts.add(stage.getScript());
            
            if (stage instanceof Clone) {
                Clone cloneStage = (Clone) stage;
                scripts.add("git checkout " + cloneStage.getBranch());
                Map<String, String> vars = new LinkedHashMap<>();
                vars.put("GIT_URL", cloneStage.getUrl());
                vars.put("CREDENTIAL_ID", cloneStage.getCreadentialId());
                stageMap.put("variables", vars);
            } else if (stage instanceof Test) {
                Test testStage = (Test) stage;
                Map<String, String> vars = new LinkedHashMap<>();
                vars.put("TEST_CLASSES", testStage.getClassesToTest());
                stageMap.put("variables", vars);
            }
            
            stageMap.put("script", scripts);
            
            // Artifacts
            if (!stage.getArtifacts().isEmpty()) {
                Map<String, List<String>> artifactMap = new LinkedHashMap<>();
                List<String> paths = new ArrayList<>();
                for (Artifact artifact : stage.getArtifacts()) {
                    paths.add(artifact.getPath() + artifact.getName());
                }
                artifactMap.put("paths", paths);
                stageMap.put("artifacts", artifactMap);
            }
            
            yamlMap.put(stageName, stageMap);
        }
        
        // Generate YAML
        try {
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            options.setPrettyFlow(true);
            
            Yaml yaml = new Yaml(options);
            FileWriter writer = new FileWriter(outputPath);
            yaml.dump(yamlMap, writer);
            writer.close();
            
            System.out.println("YAML file generated: " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static String getStageType(Stage stage) {
        if (stage instanceof Clone) return "Clone";
        if (stage instanceof Build) return "Build";
        if (stage instanceof Test) return "Test";
        if (stage instanceof Deploy) return "Deploy";
        return "Unknown";
    }
}
