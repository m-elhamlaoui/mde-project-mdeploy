import React, { useState } from "react";
import "./Form.css"; // Import the CSS file for styling

const Form = () => {
  const [formData, setFormData] = useState({
    project: {
      name: "",
      url: "",
      branch: "",
      build: [],
      tests: [], // Changed from 'testss' to 'tests'
      deploy: [],
    },
  });
  const [showJsonPreview, setShowJsonPreview] = useState(false); // For showing JSON preview
  const [jsonPreview, setJsonPreview] = useState(""); // Store JSON preview

  const handleChange = (e) => {
    const { name, value } = e.target;
    const keys = name.split(".");
    setFormData((prevData) => {
      let updatedData = { ...prevData };
      keys.reduce((acc, key, idx) => {
        if (idx === keys.length - 1) {
          acc[key] = value;
        } else {
          acc[key] = acc[key] || {};
        }
        return acc[key];
      }, updatedData);
      return updatedData;
    });
  };

  const handleAddConfig = (type) => {
    setFormData((prevData) => ({
      ...prevData,
      project: {
        ...prevData.project,
        [type]: [
          ...prevData.project[type],
          type === "tests"
            ? { name: "", type: "", cmd: "", status: "" } // Adjusted for 'tests'
            : { name: "", cmd: "", params: type === "build" ? "" : undefined },
        ],
      },
    }));
  };

  const handleDeleteConfig = (type, index) => {
    setFormData((prevData) => {
      const updatedConfigs = [...prevData.project[type]];
      updatedConfigs.splice(index, 1);
      return {
        ...prevData,
        project: {
          ...prevData.project,
          [type]: updatedConfigs,
        },
      };
    });
  };

  const handleConfigChange = (type, index, field, value) => {
    setFormData((prevData) => {
      const updatedConfigs = [...prevData.project[type]];
      updatedConfigs[index][field] = value;
      return {
        ...prevData,
        project: {
          ...prevData.project,
          [type]: updatedConfigs,
        },
      };
    });
  };

  // Handle form submission
  const handleSubmit = (e) => {
    e.preventDefault();

    // Convert form data to JSON
    const jsonData = JSON.stringify(formData, null, 2); // Pretty print JSON

    // Show JSON preview before sending
    setJsonPreview(jsonData);
    setShowJsonPreview(true);
  };

  const handleConfirmSubmit = () => {
    // Convert form data to JSON
    const jsonData = JSON.stringify(formData);

    // Create a Blob from JSON data
    const jsonBlob = new Blob([jsonData], { type: "application/json" });

    // Create FormData to send it as multipart/form-data
    const formDataToSend = new FormData();
    formDataToSend.append("file", jsonBlob, "project.json");

    // Send the JSON file to the backend
    fetch("http://localhost:8089/api/project/upload", {
      method: "POST",
      body: formDataToSend,
    })
      .then((response) => {
        if (response.ok) {
          // If the response is successful, return the YAML file as a Blob
          return response.blob();
        } else {
          throw new Error("Failed to generate the YAML file.");
        }
      })
      .then((yamlBlob) => {
        // Create a link element to trigger the download
        const link = document.createElement("a");
        const url = window.URL.createObjectURL(yamlBlob);
        link.href = url;
        link.download = "project.yaml"; // Set the desired file name
        link.click(); // Trigger the download
        window.URL.revokeObjectURL(url); // Clean up the URL object
        alert("YAML file generated and downloaded!");
      })
      .catch((error) => {
        console.error("Error:", error);
        alert("Error generating or downloading YAML file.");
      });
  };

  return (
    <div className="form-container">
      <h1 className="form-title">Project Initialization Form</h1>
      <form onSubmit={handleSubmit}>
        {/* Project Inputs */}
        <h2 className="section-title">Project Details</h2>
        <div className="form-group">
          <label>Project Name:</label>
          <input
            type="text"
            name="project.name"
            value={formData.project.name}
            onChange={handleChange}
            className="form-input"
          />
        </div>
        <div className="form-group">
          <label>Project URL:</label>
          <input
            type="text"
            name="project.url"
            value={formData.project.url}
            onChange={handleChange}
            className="form-input"
          />
        </div>
        <div className="form-group">
          <label>Branch:</label>
          <input
            type="text"
            name="project.branch"
            value={formData.project.branch}
            onChange={handleChange}
            className="form-input"
          />
        </div>

        {/* Build Configurations */}
        <h3 className="section-title">Build Configurations</h3>
        {formData.project.build.map((build, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Build Name"
              value={build.name}
              onChange={(e) =>
                handleConfigChange("build", index, "name", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Build Command"
              value={build.cmd}
              onChange={(e) =>
                handleConfigChange("build", index, "cmd", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Build Params"
              value={build.params}
              onChange={(e) =>
                handleConfigChange("build", index, "params", e.target.value)
              }
              className="config-input"
            />
            <button
              type="button"
              className="delete-btn"
              onClick={() => handleDeleteConfig("build", index)}
            >
              🗑️
            </button>
          </div>
        ))}
        <button
          type="button"
          className="add-btn"
          onClick={() => handleAddConfig("build")}
        >
          + Add Build Config
        </button>

        {/* Tests Configurations */}
        <h3 className="section-title">Tests Configurations</h3>
        {formData.project.tests.map((tests, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Tests Name"
              value={tests.name}
              onChange={(e) =>
                handleConfigChange("tests", index, "name", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Tests Type"
              value={tests.type}
              onChange={(e) =>
                handleConfigChange("tests", index, "type", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Tests Command"
              value={tests.cmd}
              onChange={(e) =>
                handleConfigChange("tests", index, "cmd", e.target.value)
              }
              className="config-input"
            />
            <input
              type="number"
              placeholder="Tests Status"
              value={tests.status}
              onChange={(e) =>
                handleConfigChange("tests", index, "status", e.target.value)
              }
              className="config-input"
            />
            <button
              type="button"
              className="delete-btn"
              onClick={() => handleDeleteConfig("tests", index)}
            >
              🗑️
            </button>
          </div>
        ))}
        <button
          type="button"
          className="add-btn"
          onClick={() => handleAddConfig("tests")}
        >
          + Add Tests Config
        </button>

        {/* Deploy Configurations */}
        <h3 className="section-title">Deploy Configurations</h3>
        {formData.project.deploy.map((deploy, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Deploy Name"
              value={deploy.name}
              onChange={(e) =>
                handleConfigChange("deploy", index, "name", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Deploy Command"
              value={deploy.cmd}
              onChange={(e) =>
                handleConfigChange("deploy", index, "cmd", e.target.value)
              }
              className="config-input"
            />
            <button
              type="button"
              className="delete-btn"
              onClick={() => handleDeleteConfig("deploy", index)}
            >
              🗑️
            </button>
          </div>
        ))}
        <button
          type="button"
          className="add-btn"
          onClick={() => handleAddConfig("deploy")}
        >
          + Add Deploy Config
        </button>

        <button type="submit" className="submit-btn">
          Show JSON Preview
        </button>
      </form>

      {/* Show JSON Preview */}
      {showJsonPreview && (
        <div className="json-preview">
          <h3>JSON Preview</h3>
          <pre>{jsonPreview}</pre>
          <button onClick={handleConfirmSubmit}>Confirm and Submit</button>
        </div>
      )}
    </div>
  );
};

export default Form;
