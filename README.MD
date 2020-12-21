This library helps encapsulate access to Clouds.

# Intro
This library is built to give an abstraction of cloud implementations.
Users of this library should not be concerned as to how to access specific services
on each cloud environment, but have a common interface to interact with such services.

Currently, Only Storage services are implemented for AWS S3 and Azure Blob Storage.

# Requirements
This library works with micronaut framework - currently 2.2.1
It Implements support for both AWS and Aure for:
* Storage 

# Configuration
In order to use this library, you need to add the following properties 
to your application.yaml. 

- cloud_environemnt: [AWS|AZURE] 
  
-Tells which cloud components to load.

if usign AWS, you need the following properties:

* for Storage Services:
  - aws.region
  - aws.bucket

if using Azure, 
* for Storage Services:
  - azure.blob_connectStr
  - azure.blob_container
