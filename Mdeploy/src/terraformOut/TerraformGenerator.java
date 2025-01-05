package terraformOut;

import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import terraform.*;

public class TerraformGenerator {
    
    public static void main(String[] args) {
        // Register Terraform package
        TerraformPackage.eINSTANCE.eClass();
        
        // Initialize EMF
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("terraform", new XMIResourceFactoryImpl());
        
        // Load model
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(
            URI.createFileURI("src/terraformOut/terraform.model"), true);
        
        TerraformConfiguration config = (TerraformConfiguration) resource.getContents().get(0);
        
        // Transform
        TerraformGenerator.transform(config, "src/terraformOut/main.tf");
    }
    
    public static void transform(TerraformConfiguration config, String outputPath) {
        StringBuilder sb = new StringBuilder();
        
        // Generate Provider blocks
        for (Provider provider : config.getProviders()) {
            generateProvider(provider, sb);
        }
        sb.append("\n");
        
        // Generate Variable blocks
        for (Variable var : config.getVariables()) {
            generateVariable(var, sb);
        }
        sb.append("\n");
        
        // Generate Resource blocks
        for (Ressource res : config.getResources()) {  // Changed Resource to Ressource
            generateResource(res, sb);
        }
        sb.append("\n");
        
        // Generate Output blocks
        for (Output output : config.getOutputs()) {
            generateOutput(output, sb);
        }
        
        // Write to file
        try {
            FileWriter writer = new FileWriter(outputPath);
            writer.write(sb.toString());
            writer.close();
            
            System.out.println("Terraform file generated: " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void generateProvider(Provider provider, StringBuilder sb) {
        sb.append("provider \"").append(provider.getName()).append("\" {\n");
        if (provider.getVersion() != null && !provider.getVersion().isEmpty()) {
            sb.append("  version = \"").append(provider.getVersion()).append("\"\n");
        }
        for (Attribute attr : provider.getAttributes()) {
            generateAttribute(attr, sb, 1);
        }
        sb.append("}\n\n");
    }
    
    private static void generateVariable(Variable var, StringBuilder sb) {
        sb.append("variable \"").append(var.getName()).append("\" {\n");
        if (var.getType() != null && !var.getType().isEmpty()) {
            sb.append("  type = ").append(var.getType()).append("\n");
        }
        // Removed description and defaultValue as they're not in the metamodel
        sb.append("}\n\n");
    }
    
    private static void generateResource(Ressource resource, StringBuilder sb) {  // Changed Resource to Ressource
        sb.append("resource \"").append(resource.getType()).append("\" \"")
          .append(resource.getName()).append("\" {\n");
        
        for (Attribute attr : resource.getAttributes()) {
            generateAttribute(attr, sb, 1);
        }
        sb.append("}\n\n");
    }
    
    private static void generateOutput(Output output, StringBuilder sb) {
        sb.append("output \"").append(output.getName()).append("\" {\n");
        sb.append("  value = ").append(output.getValue()).append("\n");
        // Removed description as it's not in the metamodel
        sb.append("}\n\n");
    }
    
    private static void generateAttribute(Attribute attr, StringBuilder sb, int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        sb.append(indent).append(attr.getKey()).append(" = ");
        if (isStringValue(attr.getValue())) {
            sb.append("\"").append(attr.getValue()).append("\"");
        } else {
            sb.append(attr.getValue());
        }
        sb.append("\n");
    }
    
    private static boolean isStringValue(String value) {
        if (value == null) return true;
        return !value.matches("^(true|false|\\d+(\\.\\d+)?|\\[.*\\]|\\{.*\\})$");
    }
}