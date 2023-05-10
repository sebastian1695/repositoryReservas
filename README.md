# Booking Service :hotel:
We have developed a REST API 🖥️ in order to create a service to book a room for a customer 🛎️. The customer must create an account to successfully book a room 📖. To create an account, the user must fill in personal information such as name, ID, email, and so on 📋. In addition, the customer must choose between a premium 🌟 or standard room ⭐. The customer can also search for room availability and price. 📆 💵 The price depends on the type of room the customer wants to stay in. On the one hand, there are standard rooms that cost 10000 per night 🌃, on the other hand, a premium room costs 20000, but customers can receive a 5% discount if they choose to stay in a standard room and provided that the customer exists in the database and the date is available.


The microservice makes use of several technologies, each one fulfilling a specific function. On the one hand, the database is managed through MySQL Workbench 🐬 , the endpoints are managed through two services: Swagger 🔖and Insomnia 🖲️. When Insomnia is used, requests are made through the Json format. When Swagger is used, the requests are generated through the specified fields.


The project is built with Spring Boot version '2.7.10', it operates with the MAVEN dependency which is java 11 compatible. In addition to this dependency, the service has three important dependencies: Spring Data JPA, Spring web and JUnit.


## Built With 🛠️
🌎 java.

🥬 spring.

🪶MAVEN.

🐬MySQL.

## Getting Started 🚙

To get a local copy up and running, follow these steps.
Prerequisites.

JDK 17 https://jdk.java.net/java-se-ri/17.

Maven https://maven.apache.org/install.html.

MySQL https://dev.mysql.com/downloads/installer/.


## Recommended Tools
IntelliJ Community https://www.jetbrains.com/idea/download/.

Insomnia https://insomnia.rest/download.

____________________________________________________________________________________________________

The routes for every services are generated through the following #ENDPOINTS:

## To create customers quickly with Insomnia: :trackball:	

Request: 

#POST: Localhost:8081/api/v1/clientes

Answer:

Code: 200 “customers created successfully”.


## To create a customer with Swagger: :clipboard:	

Request:

{
  "apellido": "Perez",
  
  "cedula": 1015453,


"correo": "cs@me.com",

"direccion": "otra casa",

"edad": 19,

"nombre": "Yuli"

}

Answer:

200 OK

## To create a customer through MySQL: 🐬

Request: 

INSERT INTO CLIENTE VALUES (111, 'Rodriguez','ro@a.com', 'cl2-2', 27,'Sebastian') 

Answer: 

ok


## To create rooms using MySQL :bellhop_bell:	

INSERT INTO HABITACION VALUES (1,10000,'estandar');

INSERT INTO HABITACION VALUES (2,10000,'estandar');

INSERT INTO HABITACION VALUES (3,10000,'estandar');

INSERT INTO HABITACION VALUES (4,10000,'estandar');

INSERT INTO HABITACION VALUES (5,10000,'estandar');

INSERT INTO HABITACION VALUES (6, 20000, 'premium');

INSERT INTO HABITACION VALUES (7, 20000, 'premium');

INSERT INTO HABITACION VALUES (8, 20000, 'premium');

INSERT INTO HABITACION VALUES (9, 20000, 'premium');

INSERT INTO HABITACION VALUES (10, 20000, 'premium');


## To book using insomnia: :trackball: 

localhost:8081/api/v1/cliente/111/habitacion/2/fecha/2023-05-20/reservar

Answer:

200 OK

## To find a book using SQL: 📆

select  * from habitacion h
left join reserva  r
on h.numero = r.habitacion
where r.fecha like '2023-05-20T05:00:00.000+00:00'
and tipo = 'estandar'

## To check availability using  SQL: ✔️
select  * from habitacion h
left join reserva  r
on h.numero = r.habitacion
where r.fecha not like '2023-05-20T05:00:00.000+00:00'
and tipo = 'estandar'


## DIAGRAMS
## UML 


![DIAGRAMA UML](https://github.com/sebastian1695/repositoryReservas/assets/119948037/285b3a14-00fd-4412-a4d2-b2137bb095cf)

## Entity- Relation

![Diagrama entidad-relacion](https://github.com/sebastian1695/repositoryReservas/assets/119948037/296bfea0-bef2-41f3-bf40-5450462159f4)

## ClASSES DIAGRAM 

## Customer
![cliente](https://github.com/sebastian1695/repositoryReservas/assets/119948037/8d87924c-96c5-4299-87a5-4d07bee26fe4)

## Room 

![habitacion](https://github.com/sebastian1695/repositoryReservas/assets/119948037/15f47eac-c9bf-4d2b-aa19-4d5064c05c51)

## Book
![RESERVA](https://github.com/sebastian1695/repositoryReservas/assets/119948037/a4343c73-3ac6-45d8-a058-d2bebfdbfdd5)



