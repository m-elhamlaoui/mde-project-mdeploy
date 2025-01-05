package com.example.mde.util;

import com.example.mde.model.terraform.*;
import com.example.mde.model.terraform.Output;
import com.example.mde.model.terraform.Provider;
import com.example.mde.model.terraform.Ressource;
import com.example.mde.model.terraform.TerraformConfiguration;
import com.example.mde.model.terraform.TerraformFactory;
import com.example.mde.model.terraform.Variable;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import java.io.File;
import java.util.List;

public class JsonToTerraform {
    public static void main(String[] args) throws Exception {
        // Parse JSON
        ObjectMapper mapper = new ObjectMapper();
        TerraformJson terraformData = mapper.readValue(new File("uploads/terraform/terraform-spec.json"), TerraformJson.class);

        // Create EMF model instances
        TerraformFactory factory = TerraformFactory.eINSTANCE;

        // Create TerraformConfiguration
        TerraformConfiguration terraformConfig = factory.createTerraformConfiguration();

        // Map resources
        for (ResourceJson resourceData : terraformData.getResources()) {
            Ressource resource = factory.createRessource();
            resource.setName(resourceData.getName());
            resource.setType(resourceData.getType());

            // Map attributes
            for (AttributeJson attributeData : resourceData.getAttributes()) {
                Attribute attribute = factory.createAttribute();
                attribute.setKey(attributeData.getKey());
                attribute.setValue(attributeData.getValue());
                
                // Add attribute to the resource
                resource.getAttributes().add(attribute);
            }

            // Add the resource to the Terraform configuration
            terraformConfig.getResources().add(resource);
        }

        // Map variables
        for (VariableJson variableData : terraformData.getVariables()) {
            Variable variable = factory.createVariable();
            variable.setName(variableData.getName());
            variable.setType(variableData.getType());

            // Add the variable to the Terraform configuration
            terraformConfig.getVariables().add(variable);
        }

        // Map providers
        for (ProviderJson providerData : terraformData.getProviders()) {
            Provider provider = factory.createProvider();
            provider.setName(providerData.getName());
            provider.setVersion(providerData.getVersion());

            // Map provider attributes
            for (AttributeJson attributeData : providerData.getAttributes()) {
                Attribute attribute = factory.createAttribute();
                attribute.setKey(attributeData.getKey());
                attribute.setValue(attributeData.getValue());

                // Add attribute to the provider
                provider.getAttributes().add(attribute);
            }

            // Add the provider to the Terraform configuration
            terraformConfig.getProviders().add(provider);
        }

        // Map outputs
        for (OutputJson outputData : terraformData.getOutputs()) {
            Output output = factory.createOutput();
            output.setName(outputData.getName());
            output.setValue(outputData.getValue());

            // Add the output to the Terraform configuration
            terraformConfig.getOutputs().add(output);
        }

        // Print the model for validation
        printTerraformModel(terraformConfig);

        // Save to XMI file
        saveModelToXMI(terraformConfig);
    }

    private static void saveModelToXMI(TerraformConfiguration terraformConfig) throws Exception {
        // Register the XMI resource factory
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        // Create a ResourceSet
        ResourceSetImpl resSet = new ResourceSetImpl();

        // Create a Resource for saving the model to an XMI file
        Resource resource = resSet.createResource(URI.createFileURI("uploads/terraform/terraform.xmi"));

        // Add the Terraform configuration model to the resource
        resource.getContents().add(terraformConfig);

        // Save the resource to the XMI file
        resource.save(null);  // Pass 'null' for options, or use a map for specific options
        System.out.println("Model saved to terraform.xmi");
    }

    private static void printTerraformModel(TerraformConfiguration terraformConfig) {
        System.out.println("Terraform Configuration:");

        // Print Resources
        for (Ressource resource : terraformConfig.getResources()) {
            System.out.println("Resource Name: " + resource.getName());
            System.out.println("Resource Type: " + resource.getType());
            for (Attribute attribute : resource.getAttributes()) {
                System.out.println("  Attribute Key: " + attribute.getKey());
                System.out.println("  Attribute Value: " + attribute.getValue());
            }
        }

        // Print Variables
        for (Variable variable : terraformConfig.getVariables()) {
            System.out.println("Variable Name: " + variable.getName());
            System.out.println("Variable Type: " + variable.getType());
        }

        // Print Providers
        for (Provider provider : terraformConfig.getProviders()) {
            System.out.println("Provider Name: " + provider.getName());
            System.out.println("Provider Version: " + provider.getVersion());
            for (Attribute attribute : provider.getAttributes()) {
                System.out.println("  Attribute Key: " + attribute.getKey());
                System.out.println("  Attribute Value: " + attribute.getValue());
            }
        }

        // Print Outputs
        for (Output output : terraformConfig.getOutputs()) {
            System.out.println("Output Name: " + output.getName());
            System.out.println("Output Value: " + output.getValue());
        }
    }
}

// JSON Helper Classes
class TerraformJson {
    private List<ResourceJson> resources;
    private List<VariableJson> variables;
    private List<ProviderJson> providers;
    private List<OutputJson> outputs;

    // Getters and setters
    public List<ResourceJson> getResources() { return resources; }
    public void setResources(List<ResourceJson> resources) { this.resources = resources; }

    public List<VariableJson> getVariables() { return variables; }
    public void setVariables(List<VariableJson> variables) { this.variables = variables; }

    public List<ProviderJson> getProviders() { return providers; }
    public void setProviders(List<ProviderJson> providers) { this.providers = providers; }

    public List<OutputJson> getOutputs() { return outputs; }
    public void setOutputs(List<OutputJson> outputs) { this.outputs = outputs; }
}

class ResourceJson {
    private String name;
    private String type;
    private List<AttributeJson> attributes;

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public List<AttributeJson> getAttributes() { return attributes; }
    public void setAttributes(List<AttributeJson> attributes) { this.attributes = attributes; }
}

class AttributeJson {
    private String key;
    private String value;

    // Getters and setters
    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}

class VariableJson {
    private String name;
    private String type;

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}

class ProviderJson {
    private String name;
    private String version;
    private List<AttributeJson> attributes;

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public List<AttributeJson> getAttributes() { return attributes; }
    public void setAttributes(List<AttributeJson> attributes) { this.attributes = attributes; }
}

class OutputJson {
    private String name;
    private String value;

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}




