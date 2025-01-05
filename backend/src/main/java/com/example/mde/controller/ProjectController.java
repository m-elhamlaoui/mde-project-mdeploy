package com.example.mde.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.mde.service.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

	private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

 // Endpoint to receive and store the JSON file
    @PostMapping("/upload")
    public String uploadJsonFile(@RequestParam("file") MultipartFile file) {
        try {
            // Define the path where the file will be saved
            String uploadDir = "C:\\Users\\HP\\Documents\\projects\\mde-project-mdeploy\\backend\\uploads";
            File directory = new File(uploadDir);
            if (!directory.exists()) {
                directory.mkdirs(); // Create directory if it does not exist
            }

            // Create the file on the server
            File jsonFile = new File(uploadDir + "project.json");
            file.transferTo(jsonFile);

            // Call the service to execute the transformation with the path of the stored file
            projectService.executeTransformation(jsonFile.getAbsolutePath());

            return "File uploaded successfully and transformation process started.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error uploading file: " + e.getMessage();
        }
    }
}
