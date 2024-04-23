<div align="center">
  <h3 align="center">ActiveTO</h3>
  <p align="center">Drop-In Activities at City of Toronto Recreation Facilities
</p>
</div>

## About the app
Active is a mobile application that allows users to browse and search drop-in activities at City of Toronto Recreation Facilities.

Although there is a open resource API for Toronto's recreation facilities and activities, it is provided in the formats of JSON and CSV which is not a easy access for a non-developer user and not readable.
The app collects the data using a Python processor and publishes the restructered info using Spring Boot REST API Server on Docker.

## Built With
Java
Spring Boot
Python
MySQL
REST API
Docker
Beautiful Soup

It provides in total 15 HTTP endpionts:
![Screenshot 2024-04-22 at 8 08 34 PM](https://github.com/dongyue-zhang/Active_Toronto_Docker/assets/93807577/e34174b3-7703-484c-a830-a101f63f6ae3)

Checking endpoints in Swagger-ui: http://159.89.121.107:8080/swagger-ui/index.html
