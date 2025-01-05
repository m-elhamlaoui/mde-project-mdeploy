package com.example.mde.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.mde.service.TerraformService;

@RestController
@RequestMapping("/api/terraform")
public class TerraformController {

	private final TerraformService terrraformService;

    @Autowired
    public TerraformController(TerraformService terrraformService) {
        this.terrraformService = terrraformService;
    }

 // Endpoint to receive and store the JSON file
    @PostMapping("/upload")
    public ResponseEntity<?> uploadJsonFile(@RequestParam("file") MultipartFile file) {
        try {
            // Define the path where the file will be saved
        	String uploadDir = System.getProperty("user.dir") + "/uploads/terraform";
            File directory = new File(uploadDir);
            if (!directory.exists()) {
                directory.mkdirs(); // Create directory if it does not exist
            }

            // Create the file on the server
            File jsonFile = new File(uploadDir + File.separator + "terraform-spec.json");
            file.transferTo(jsonFile);

            // Call the service to execute the transformation
            String terraPath = terrraformService.executeTransformation(jsonFile.getAbsolutePath());

            if (terraPath != null) {
                // Read the generated YAML file
                File terraFile = new File(terraPath);
                if (terraFile.exists()) {
                    return ResponseEntity.ok()
                            .header("Content-Disposition", "attachment; filename=main.tf")
                            .body(Files.readAllBytes(terraFile.toPath()));
                } else {
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                            .body("Terraform file not generated.");
                }
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Error during transformation process.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error uploading file: " + e.getMessage());
        }
    }
}
