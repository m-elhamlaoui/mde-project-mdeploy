package com.example.mde.util;

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

import com.example.mde.model.gitlab.Artifact;
import com.example.mde.model.gitlab.Build;
import com.example.mde.model.gitlab.Clone;
import com.example.mde.model.gitlab.Deploy;
import com.example.mde.model.gitlab.GitlabPackage;
import com.example.mde.model.gitlab.Pipeline;
import com.example.mde.model.gitlab.Stage;
import com.example.mde.model.gitlab.Test;

public class GitlabToYaml {
    public static void main(String[] args) {
        // Register GitLab package
        GitlabPackage.eINSTANCE.eClass();

        // Initialize EMF
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());

        // Load model
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(
            URI.createFileURI("uploads/gitlab.xmi"), true);

        Pipeline pipeline = (Pipeline) resource.getContents().get(0);

        // Transform
        GitlabToYaml.transform(pipeline, "uploads/gitlab-ci.yml");
    }

    public static void transform(Pipeline pipeline, String outputPath) {
        Map<String, Object> yamlMap = new LinkedHashMap<>();

        // Add stages
        List<String> stageNames = new ArrayList<>();
        List<Stage> stages = new ArrayList<>(pipeline.getStages());
        Collections.sort(stages, (a, b) -> Integer.compare(a.getOrder(), b.getOrder()));
        for (Stage stage : stages) {
            stageNames.add(getStageType(stage).toLowerCase());
        }
        yamlMap.put("stages", stageNames);

        // Process each stage
        for (Stage stage : stages) {
            String stageKey = getStageType(stage).toLowerCase();
            Map<String, Object> stageMap = new LinkedHashMap<>();

            stageMap.put("stage", stageKey);
            List<String> scripts = new ArrayList<>();
            scripts.add(stage.getScript());

            // Add triggers if present in the stage
            if (stage.getTrigger() != null) {
                stageMap.put("only", Collections.singletonList(stage.getTrigger().getCondition()));
            }

            // Stage-specific logic
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
                Map<String, Object> artifactMap = new LinkedHashMap<>();
                List<String> paths = new ArrayList<>();
                for (Artifact artifact : stage.getArtifacts()) {
                    paths.add(artifact.getPath() + artifact.getName());
                }
                artifactMap.put("paths", paths);
                stageMap.put("artifacts", artifactMap);
            }

            yamlMap.put(stageKey, stageMap);
        }

        // Generate YAML with proper indentation
        try {
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            options.setPrettyFlow(true);
            options.setIndent(2); // Set indentation level to 2 spaces
            options.setIndicatorIndent(1); // Ensure indicatorIndent < indent

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
