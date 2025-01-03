# MDEploy

## Table of content

- [Requirements](#requirements)
- [Metamodels](#metamodels)
    - [Initial project configuration metamodel](#initial-project-configuration-metamodel)
    - [Gitlab metamodel](#gitlab-metamodel)
- [T2M transformation: Converting JSON data into initConfig model](#t2m-transformation-converting-json-data-into-initconfig-model)
- [Contributors](#contributors)

## Requirements

- Eclipse Modeling Tools 2022 [Find here](https://www.eclipse.org/downloads/packages/release/2021-03/r/eclipse-modeling-tools)
- jackson-annotations, jackson-core, jackson-databind and eclipse.emf.ecore.xmi jar libraries

## Metamodels

### Initial project configuration metamodel

<p align="center">
    <img width="80%" src="assets/initConfig_metamodel.PNG" />
</p>

### Gitlab metamodel

Following Gitlab's core concepts, a pipeline is composed of multiple stages (we limited it to "cloning," "tests," "build," and "deploy").
A pipeline is triggered by a condition withing a 'Trigger'.
Each stage may generate some artifacts.

<p align="center">
    <img width="80%" src="assets/gitlab_metamodel.PNG" />
</p>

## T2M transformation: Converting JSON data into initConfig model

The script `JsontToModel.java` parses JSON data and converts it to an initConfig model of XMI format.

## Contributors
- [@Cristal32](https://github.com/Cristal32)
- [@HM2811](https://github.com/HM2811)
- [@fatibr19](https://github.com/fatibr19)
- [@lamAz19](https://github.com/lamAz19)