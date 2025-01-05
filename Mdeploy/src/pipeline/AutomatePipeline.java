package pipeline;

//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import projectIn.JsonToModel;
//import java.io.File;
//import org.eclipse.epsilon.eol.IEolExecutableModule;
//import org.eclipse.epsilon.eol.models.IModel;
//import org.eclipse.epsilon.etl.EtlModule;
//import org.eclipse.epsilon.egl.EglTemplateFactory;

public class AutomatePipeline {

//    public static void main(String[] args) throws Exception {
//        // Step 1: JSON to InitConfig
//        System.out.println("Step 1: Parsing JSON and creating InitConfig model...");
//        JsonToModel.main(null); 
//
//        // Step 2: M2M Transformation (InitConfig to GitLab)
//        System.out.println("Step 2: Executing M2M transformation...");
//        executeEtlTransformation("src/m2mTransformation/initConfigToGitlabEpsilon.etl", 
//                                  "src/projectIn/project.xmi", 
//                                  "src/m2mTransformation/gitlab.model");
//
//        // Step 3: M2T Transformation (GitLab to YAML)
//        System.out.println("Step 3: Executing M2T transformation...");
//        executeEglTransformation("src/projectOut/gitlabToYamlEpsilon.egl", 
//                                  "src/m2mTransformation/gitlab.model", 
//                                  "src/projectOut/gitlab-ci2.yml");
//
//        System.out.println("Pipeline automation completed successfully!");
//    }
//
//    private static void executeEtlTransformation(String etlFilePath, String sourceXmi, String targetXmi) throws Exception {
//        IEolExecutableModule module = new EtlModule();
//
//        module.parse(new File(etlFilePath));
//        if (module.getParseProblems().size() > 0) {
//            throw new RuntimeException("ETL parse errors: " + module.getParseProblems());
//        }
//
//        IModel sourceModel = createEmfModel("InitConfigModel", sourceXmi, "InitConfig");
//        IModel targetModel = createEmfModel("GitlabModel", targetXmi, "gitlab");
//
//        module.getContext().getModelRepository().addModel(sourceModel);
//        module.getContext().getModelRepository().addModel(targetModel);
//
//        module.execute();
//        targetModel.store();
//    }
//
//    private static void executeEglTransformation(String eglFilePath, String sourceXmi, String targetYaml) throws Exception {
//        EglTemplateFactory factory = new EglTemplateFactory();
//        factory.getContext().getModelRepository().addModel(createEmfModel("GitlabModel", sourceXmi, "gitlab"));
//
//        String result = factory.load(eglFilePath).process();
//        File outputFile = new File(targetYaml);
//        java.nio.file.Files.write(outputFile.toPath(), result.getBytes());
//    }
//
//    private static IModel createEmfModel(String name, String filePath, String metamodelUri) throws Exception {
//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
//
//        ResourceSetImpl resourceSet = new ResourceSetImpl();
//        Resource resource = resourceSet.createResource(URI.createFileURI(filePath));
//        resource.load(null);
//
//        return new EmfModel(name, resource, metamodelUri);
//    }
}
