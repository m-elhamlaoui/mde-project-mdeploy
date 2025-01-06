import React, { useState } from "react";
import "./Form.css";

const Form = () => {
  const [currentForm, setCurrentForm] = useState("projectInit"); // Manage which form is displayed
  const [formData, setFormData] = useState({
    name: "",
    url: "",
    branch: "",
    build: [],
    tests: [],
    deploy: [],
  });
  const [showJsonPreview, setShowJsonPreview] = useState(false);
  const [jsonPreview, setJsonPreview] = useState("");

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleAddConfig = (type) => {
    setFormData((prevData) => ({
      ...prevData,
      [type]: [
        ...prevData[type],
        type === "tests"
          ? { name: "", type: "", cmd: "", status: "" }
          : { name: "", cmd: "", params: type === "build" ? "" : undefined },
      ],
    }));
  };

  const handleDeleteConfig = (type, index) => {
    setFormData((prevData) => ({
      ...prevData,
      [type]: prevData[type].filter((_, i) => i !== index),
    }));
  };

  const handleConfigChange = (type, index, field, value) => {
    setFormData((prevData) => ({
      ...prevData,
      [type]: prevData[type].map((item, i) =>
        i === index ? { ...item, [field]: value } : item
      ),
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const jsonData = JSON.stringify(formData, null, 2);
    setJsonPreview(jsonData);
    setShowJsonPreview(true);
  };

  const handleConfirmSubmit = () => {
    const jsonData = JSON.stringify(formData);
    const jsonBlob = new Blob([jsonData], { type: "application/json" });
    const formDataToSend = new FormData();
    formDataToSend.append("file", jsonBlob, "project.json");

    fetch("http://localhost:8089/api/project/upload", {
      method: "POST",
      body: formDataToSend,
    })
      .then((response) => {
        if (response.ok) {
          return response.blob();
        }
        throw new Error("Failed to generate the YAML file.");
      })
      .then((yamlBlob) => {
        const link = document.createElement("a");
        const url = window.URL.createObjectURL(yamlBlob);
        link.href = url;
        link.download = "project.yaml";
        link.click();
        window.URL.revokeObjectURL(url);
        alert("YAML file generated and downloaded!");
      })
      .catch((error) => {
        console.error("Error:", error);
        alert("Error generating or downloading YAML file.");
      });
  };

  const renderProjectInitForm = () => (
    <div>
      <div className="">
      <h1 className="form-title">Project Initialization Form</h1>
      <form onSubmit={handleSubmit}>
        <h2 className="section-title">Project Details</h2>
        <div className="form-group">
          <label>Project Name:</label>
          <input
            type="text"
            name="name"
            value={formData.name}
            onChange={handleChange}
            className="form-input"
          />
        </div>
        <div className="form-group">
          <label>Project URL:</label>
          <input
            type="text"
            name="url"
            value={formData.url}
            onChange={handleChange}
            className="form-input"
          />
        </div>
        <div className="form-group">
          <label>Branch:</label>
          <input
            type="text"
            name="branch"
            value={formData.branch}
            onChange={handleChange}
            className="form-input"
          />
        </div>

        <h3 className="section-title">Build Configurations</h3>
        {formData.build.map((build, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Build Name"
              value={build.name}
              onChange={(e) => handleConfigChange("build", index, "name", e.target.value)}
              className="config-input"
            />
            <input
              type="text"
              placeholder="Build Command"
              value={build.cmd}
              onChange={(e) => handleConfigChange("build", index, "cmd", e.target.value)}
              className="config-input"
            />
            <input
              type="text"
              placeholder="Build Params"
              value={build.params}
              onChange={(e) => handleConfigChange("build", index, "params", e.target.value)}
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

        <h3 className="section-title">Tests Configurations</h3>
        {formData.tests.map((test, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Tests Name"
              value={test.name}
              onChange={(e) => handleConfigChange("tests", index, "name", e.target.value)}
              className="config-input"
            />
            <input
              type="text"
              placeholder="Tests Type"
              value={test.type}
              onChange={(e) => handleConfigChange("tests", index, "type", e.target.value)}
              className="config-input"
            />
            <input
              type="text"
              placeholder="Tests Command"
              value={test.cmd}
              onChange={(e) => handleConfigChange("tests", index, "cmd", e.target.value)}
              className="config-input"
            />
            <input
              type="number"
              placeholder="Tests Status"
              value={test.status}
              onChange={(e) => handleConfigChange("tests", index, "status", e.target.value)}
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

        <h3 className="section-title">Deploy Configurations</h3>
        {formData.deploy.map((deploy, index) => (
          <div key={index} className="config-item">
            <input
              type="text"
              placeholder="Deploy Name"
              value={deploy.name}
              onChange={(e) => handleConfigChange("deploy", index, "name", e.target.value)}
              className="config-input"
            />
            <input
              type="text"
              placeholder="Deploy Command"
              value={deploy.cmd}
              onChange={(e) => handleConfigChange("deploy", index, "cmd", e.target.value)}
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
        <div className="button-container">
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
        </div>
      </form>

      {showJsonPreview && (
        <div className="json-preview">
          <h3>JSON Preview</h3>
          <pre>{jsonPreview}</pre>
          <button onClick={handleConfirmSubmit}>Confirm and Submit</button>
        </div>
      )}
    </div>
  </div>
  );

  const renderTerraformForm = () => (
    <div>
      <h1 className="form-title">Terraform Model Form</h1>
      <form>
        {/* Terraform form fields */}
        <div className="form-group">
          <label>Terraform Config:</label>
          <textarea className="form-input" placeholder="Enter your config..." />
        </div>
        <button type="submit" className="submit-btn">
          Submit Terraform Config
        </button>
      </form>
    </div>
  );

  return (
    <div className="app-container">
      <nav className="navbar">
        <button
          className={`nav-btn ${
            currentForm === "projectInit" ? "active" : ""
          }`}
          onClick={() => setCurrentForm("projectInit")}
        >
          Project Initialization Form
        </button>
        <button
          className={`nav-btn ${
            currentForm === "terraform" ? "active" : ""
          }`}
          onClick={() => setCurrentForm("terraform")}
        >
          Terraform Model Form
        </button>
      </nav>

      <div className="form-container">
        {currentForm === "projectInit"
          ? renderProjectInitForm()
          : renderTerraformForm()}
      </div>
    </div>
  );
};

export default Form;
