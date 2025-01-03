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
            
            // Create a new Trigger for a "push" event
            Trigger gitlabTrigger = gitlabFactory.createTrigger();
            // Set the trigger properties
            gitlabTrigger.setName("Push Trigger");  // You can dynamically set the name if needed
            gitlabTrigger.setCondition("push");  // Set the trigger condition to "push"
            gitlabTrigger.setPipeline(gitlabPipeline);
            // Add the Trigger to the pipeline
            gitlabPipeline.getTriggers().add(gitlabTrigger);

            // Create and map the Clone stage
            Clone gitlabClone = gitlabFactory.createClone();
            gitlabClone.setUrl(initConfigProject.getUrl()); // Map Project URL to Clone URL
            gitlabClone.setBranch(initConfigProject.getBranch()); // Map Project Branch to Clone Branch
            gitlabClone.setOrder(0); 
            gitlabClone.setPipeline(gitlabPipeline);
            gitlabClone.setScript("git clone " + initConfigProject.getUrl());
            gitlabPipeline.getStages().add(gitlabClone);
            
            // Transform BuildConfigs to Build stages
            for (InitConfig.Build initConfigBuild : initConfigProject.getBuildconfigs()) {
                gitlab.Build gitlabBuild = gitlabFactory.createBuild();
                gitlabBuild.setScript(initConfigBuild.getCmd());
                gitlabBuild.setOrder(1);
                gitlabBuild.setPipeline(gitlabPipeline);
                gitlabPipeline.getStages().add(gitlabBuild);
            }

            // Transform Tests to Test stages
            for (InitConfig.Test initConfigTest : initConfigProject.getTests()) {
                gitlab.Test gitlabTest = gitlabFactory.createTest();
                gitlabTest.setScript(initConfigTest.getCmd());
                gitlabTest.setOrder(2);
                gitlabTest.setPipeline(gitlabPipeline);
                gitlabTest.setClassesToTest(initConfigTest.getName()); // Map appropriately
                gitlabPipeline.getStages().add(gitlabTest);
            }

            // Transform DeployConfigs to Deploy stages
            for (InitConfig.Deploy initConfigDeploy : initConfigProject.getDeployconfigs()) {
                gitlab.Deploy gitlabDeploy = gitlabFactory.createDeploy();
                gitlabDeploy.setScript(initConfigDeploy.getCmd());
                gitlabDeploy.setOrder(3); 
                gitlabDeploy.setPipeline(gitlabPipeline);
                gitlabPipeline.getStages().add(gitlabDeploy);
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
}

