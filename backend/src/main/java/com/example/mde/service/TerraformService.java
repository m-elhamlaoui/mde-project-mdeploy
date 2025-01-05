package com.example.mde.service;

import org.springframework.stereotype.Service;
import com.example.mde.util.TerraformGenerator;

@Service
public class TerraformService {
	
	public String executeTransformation(String jsonFilePath) {
        try {
            // Execute the TerraformGenerator transformation
            TerraformGenerator.main(new String[0]);

            // Assuming GitlabToYaml generates the YAML file at a specific path
            String generatedTerraformPath = "uploads/main.tf";
            System.out.println("Generated Terraform: " + generatedTerraformPath);

            return generatedTerraformPath;
        } catch (Exception e) {
            System.err.println("Error during transformation process: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
