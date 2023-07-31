"# ria-sikhona Restful Web Application" 


Write a basic Java + Spring (or Spring Boot) based implementation of the endpoint above.
a. When calling the endpoint, the response object should be serialized to json with a
response code of 200 as per the documentation.

b. Your implementation of the endpoint does not require any authentication.
c. The endpoint does not need to be hosted anywhere. It just needs to compile and be
able to be run locally (localhost).


Description
-----------

This endpoint returns a list of provinces.
Signature
Endpoint: http://localhost:8083/api/province
Method: GET
Produces: application/json

## Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven 3.6.3 or later
- MySQL Database Mysql 8.0 0r later



The application will be accessible at `http://localhost:8083/api/province`.

## Database Script
The database script is provided in the `database` folder. It contains the SQL statements to create the necessary tables and insert some initial data.

## How to Run the Database Script

1. Ensure your MySQL server is running and accessible.
2. Connect to your MySQL server using a database management tool or command-line interface.
3. Create a new database for the application:

  




