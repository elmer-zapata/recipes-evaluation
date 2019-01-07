# recipes-evaluation

***The next endpoints were created:***
PUT http://localhost:8080/user to register users
GET http://localhost:8080/user to get information of users
PUT http://localhost:8080/user/{id} to modify users

PUT http://localhost:8080/recipe to recipe recipes
GET http://localhost:8080/recipe/{user_id} to get recipes of users
GET http://localhost:8080/recipe/{id} to get especify recipe 
PUT http://localhost:8080/recipe/{id} to modify especify recipe 
DELETE http://localhost:8080/recipe/{id} to delete especify recipe 


***The next libraries were used***
* spring-boot-starter
* spring-boot-starter-data-jpa
* spring-boot-starter-web
* spring-boot-starter-data-rest
* jackson-core
* spring-boot-starter-aop
* spring-boot-devtools
* mysql-connector-java

*To generate the jar*
* gradle build

*To execute the jar*
* java -jar build/libs/recipes-evaluation-0.0.1-SNAPSHOT.jar
