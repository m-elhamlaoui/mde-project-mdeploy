package m2mTransformation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import InitConfig.*;
import gitlab.*;

public class InitConfigToGitLabTransformer {

    public static void main(String[] args) {
        // Register InitConfig and GitLab packages
        InitConfigPackage.eINSTANCE.eClass();
        GitlabPackage.eINSTANCE.eClass();
        
        // Initialize EMF resources
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        ResourceSet resourceSet = new ResourceSetImpl();

        try {
            // Load InitConfig model
            Resource initConfigResource = resourceSet.getResource(URI.createURI("src/projectIn/project.xmi"), true);
            Project initConfigProject = (Project) initConfigResource.getContents().get(0);

            // Create a new GitLab model
            GitlabFactory gitlabFactory = GitlabFactory.eINSTANCE;
            Pipeline gitlabPipeline = gitlabFactory.createPipeline();
            gitlabPipeline.setName(initConfigProject.getName());

            // Create and map the Clone stage (generalized)
            addStageToPipeline(gitlabFactory, gitlabPipeline, "Clone", initConfigProject.getUrl(), 0, "git clone " + initConfigProject.getUrl(), "Clone", initConfigProject.getBranch());

            // Transform BuildConfigs to Build stages (generalized)
            for (InitConfig.Build initConfigBuild : initConfigProject.getBuild()) {
                addStageToPipeline(gitlabFactory, gitlabPipeline, initConfigBuild.getName(), initConfigBuild.getCmd(), 1, initConfigBuild.getCmd(), "Build", initConfigProject.getBranch());
            }

            // Transform Tests to Test stages (generalized)
            for (InitConfig.Test initConfigTest : initConfigProject.getTests()) {
                addStageToPipeline(gitlabFactory, gitlabPipeline, initConfigTest.getName(), initConfigTest.getCmd(), 2, initConfigTest.getCmd(), "Test", initConfigProject.getBranch());
            }

            // Transform DeployConfigs to Deploy stages (generalized)
            for (InitConfig.Deploy initConfigDeploy : initConfigProject.getDeploy()) {
                addStageToPipeline(gitlabFactory, gitlabPipeline, initConfigDeploy.getName(), initConfigDeploy.getCmd(), 3, initConfigDeploy.getCmd(), "Deploy", initConfigProject.getBranch());
            }

            // Save the transformed GitLab model
            Resource gitlabResource = resourceSet.createResource(URI.createURI("src/m2mTransformation/gitlab.xmi"));
            gitlabResource.getContents().add(gitlabPipeline);
            gitlabResource.save(null);

            System.out.println("Transformation completed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Generalized method for adding stages to the pipeline
    private static void addStageToPipeline(GitlabFactory gitlabFactory, Pipeline gitlabPipeline, String name, String url, int order, String script, String stageType, String branch) {
        Stage gitlabStage;
        switch (stageType) {
            case "Clone":
                gitlabStage = gitlabFactory.createClone();
                ((Clone) gitlabStage).setUrl(url);  // Set the URL for Clone
                ((Clone) gitlabStage).setBranch(branch);
                ((gitlab.Clone) gitlabStage).setScript("git clone " + url);
                break;
            case "Build":
                gitlabStage = gitlabFactory.createBuild();
                ((gitlab.Build) gitlabStage).setScript(script);
                break;
            case "Test":
                gitlabStage = gitlabFactory.createTest();
                ((gitlab.Test) gitlabStage).setScript(script);
                ((gitlab.Test) gitlabStage).setClassesToTest("Example.java");  // Map appropriately
                break;
            case "Deploy":
                gitlabStage = gitlabFactory.createDeploy();
                ((gitlab.Deploy) gitlabStage).setScript(script);
                break;
            default:
                throw new IllegalArgumentException("Unknown stage type: " + stageType);
        }

        // Create a new Trigger for a "push" event
        Trigger gitlabTrigger = gitlabFactory.createTrigger();
        gitlabTrigger.setName("Push Trigger");  // You can dynamically set the name if needed
        gitlabTrigger.setCondition("push");  // Set the trigger condition to "push"
        gitlabTrigger.setType("manual");
        
        // Set the common properties
        gitlabStage.setName(name);
        gitlabStage.setOrder(order);
        gitlabStage.setPipeline(gitlabPipeline);
        gitlabStage.setTrigger(gitlabTrigger);
        gitlabPipeline.getStages().add(gitlabStage);
    }
}
