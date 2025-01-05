package com.example.mde.service;

import org.springframework.stereotype.Service;
import com.example.mde.util.JsonToModel;
import com.example.mde.util.GitlabToYaml;
import com.example.mde.util.InitConfigToGitLabTransformer;

@Service
public class ProjectService {
	
	public String executeTransformation(String jsonFilePath) {
        try {
            // Execute the JsonToModel transformation
            JsonToModel.main(new String[]{jsonFilePath});

            // Execute the InitConfigToGitLabTransformer transformation
            InitConfigToGitLabTransformer.main(new String[0]);

            // Execute the GitlabToYaml transformation, which generates the `gitlab-ci.yml`
            GitlabToYaml.main(new String[0]);

            // Assuming GitlabToYaml generates the YAML file at a specific path
            String generatedYamlPath = "uploads/gitlab-ci.yml";
            System.out.println("Generated YAML: " + generatedYamlPath);

            return generatedYamlPath;
        } catch (Exception e) {
            System.err.println("Error during transformation process: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
