// src/Form.js
import React, { useState } from "react";
import "./Form.css"; // Import the CSS file for styling

const Form = () => {
  const [formData, setFormData] = useState({
    project: {
      name: "",
      url: "",
      branch: "",
      builds: [],
      tests: [],
      deploys: [],
    },
  });

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
          { name: "", cmd: "", params: type === "builds" ? "" : undefined },
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

  const handleSubmit = (e) => {
    e.preventDefault();
  
    // Convert form data to JSON
    const jsonData = JSON.stringify(formData, null, 2);
    console.log("Generated JSON:", jsonData);
  
    // Send JSON to the backend
    fetch("http://localhost:8089/api/projects/upload", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: jsonData,
    })
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("Failed to submit data");
        }
      })
      .then((data) => {
        console.log("Response from backend:", data);
        alert("Data submitted successfully!");
      })
      .catch((error) => {
        console.error("Error submitting data:", error);
        alert("Failed to submit data. Please try again.");
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
        {formData.project.builds.map((build, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Build Name"
              value={build.name}
              onChange={(e) =>
                handleConfigChange("builds", index, "name", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Build Command"
              value={build.cmd}
              onChange={(e) =>
                handleConfigChange("builds", index, "cmd", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Build Params"
              value={build.params}
              onChange={(e) =>
                handleConfigChange("builds", index, "params", e.target.value)
              }
              className="config-input"
            />
            <button
              type="button"
              className="delete-btn"
              onClick={() => handleDeleteConfig("builds", index)}
            >
              🗑️
            </button>
          </div>
        ))}
        <button
          type="button"
          className="add-btn"
          onClick={() => handleAddConfig("builds")}
        >
          + Add Build Config
        </button>

        {/* Test Configurations */}
        <h3 className="section-title">Test Configurations</h3>
        {formData.project.tests.map((test, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Test Name"
              value={test.name}
              onChange={(e) =>
                handleConfigChange("tests", index, "name", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Test Command"
              value={test.cmd}
              onChange={(e) =>
                handleConfigChange("tests", index, "cmd", e.target.value)
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
          + Add Test Config
        </button>

        {/* Deploy Configurations */}
        <h3 className="section-title">Deploy Configurations</h3>
        {formData.project.deploys.map((deploy, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Deploy Name"
              value={deploy.name}
              onChange={(e) =>
                handleConfigChange("deploys", index, "name", e.target.value)
              }
              className="config-input"
            />
            <input
              type="text"
              placeholder="Deploy Command"
              value={deploy.cmd}
              onChange={(e) =>
                handleConfigChange("deploys", index, "cmd", e.target.value)
              }
              className="config-input"
            />
            <button
              type="button"
              className="delete-btn"
              onClick={() => handleDeleteConfig("deploys", index)}
            >
              🗑️
            </button>
          </div>
        ))}
        <button
          type="button"
          className="add-btn"
          onClick={() => handleAddConfig("deploys")}
        >
          + Add Deploy Config
        </button>

        <button type="submit" className="submit-btn">
          Generate JSON
        </button>
      </form>
    </div>
  );
};

export default Form;
