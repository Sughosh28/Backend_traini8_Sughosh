#######

## Description
This application is a RESTful API for managing government-funded training centers.

## Features
- Create and read the training centers.
- Validate inputs with detailed error messages.
- Exception handling for API responses.

**Exception Handler is used.**

This application runs on port num. 8085


The POST request is: 

localhost:8085/api/addTrainingCenters

**Fetches all training centers**

The GET request is: 

localhost:8085/api/getTrainingCenters



**Fetches training centers using filters
This runs with the parameters. If the parameters are not specified then the default parameters are used.**

The GET request is: 

localhost:8085/api/filterTrainingCenters

**Fetches training centres based on courses**

The GET request is:

localhost:8085/api/getTrainingCentersByCourse

