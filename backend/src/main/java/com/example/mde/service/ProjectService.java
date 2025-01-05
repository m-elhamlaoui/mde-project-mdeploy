package com.example.mde.service;

import org.springframework.stereotype.Service;
import com.example.mde.util.JsonToModel;
import com.example.mde.util.GitlabToYaml;
import com.example.mde.util.InitConfigToGitLabTransformer;

@Service
public class ProjectService {
	
	public void executeTransformation(String jsonFilePath) {
        try {
            // Execute the JsonToModel transformation and pass the file path
            JsonToModel.main(new String[]{jsonFilePath});

            // Execute the InitConfigToGitLabTransformer transformation
            InitConfigToGitLabTransformer.main(new String[0]);

            // Execute the GitlabToYaml transformation
            GitlabToYaml.main(new String[0]);

            System.out.println("All transformations completed successfully!");
        } catch (Exception e) {
            System.err.println("Error during transformation process: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
