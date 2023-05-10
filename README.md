# Booking Service :hotel:
We have developed a REST API in order to create a service to book a room for a customer. The customer must create an account to successfully book a room. To create an account, the user must fill in personal information such as name, ID, email, and so on. In addition, the customer must choose between a premium or standard room. The customer can also search for room availability and price. The price depends on the type of room the customer wants to stay in. On the one hand, there are standard rooms that cost 10000 per night, on the other hand, a premium room costs 20000, but customers can receive a 5% discount if they choose to stay in a standard room and provided that the customer exists in the database and the date is available.
The microservice makes use of several technologies, each one fulfilling a specific function. On the one hand, the database is managed through MySQL Workbench, the endpoints are managed through two services: Swagger and Insomnia. When Insomnia is used, requests are made through the Json format. When Swagger is used, the requests are generated through the specified fields.

The project is built with Spring Boot version '2.7.10', it operates with the MAVEN dependency which is java 11 compatible. In addition to this dependency, the service has three important dependencies: Spring Data JPA, Spring web and JUnit.
Built With
:earth_americas: java
 spring
MAVEN
MySQL
Getting Started
To get a local copy up and running follow these steps.
Prerequisites
JDK 17 https://jdk.java.net/java-se-ri/17
Maven https://maven.apache.org/install.html
MySQL https://dev.mysql.com/downloads/installer/
Recommended Tools
IntelliJ Community https://www.jetbrains.com/idea/download/
