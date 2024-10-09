#######

## Description
This application is a RESTful API for managing government-funded training centers.

## Features
- Create and read the training centers.
- Validate inputs with detailed error messages.
- Exception handling for API responses.

**Exception Handler is used.**


## Configuration

Before running the application, make sure to configure your PostgreSQL database connection. You need to set your database username and password in the `application.properties` file.

### Steps to Configure

1. Open the `src/main/resources/application.properties` file.
2. Update the following lines with your PostgreSQL credentials:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/MVP_traini8
   spring.datasource.username=your_username       # Replace with your PostgreSQL username
   spring.datasource.password=your_password       # Replace with your PostgreSQL password


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

