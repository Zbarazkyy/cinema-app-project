## *`Cinema - web app`*

_You can see how the program works on a remote server by following
this link [https://cinema-app-by-zbarazkyy.herokuapp.com/](https://cinema-app-by-zbarazkyy.herokuapp.com/login) <br> 
Please use a reserved user (name: "user@gmail.com", password: "87654321") or register (POST - /register)_ <br><br>
_This project is the implementation of the main functions of interaction between the cinema and the user. User can buy tickets for a specific movie session. To buy tickets user firstly adds them to the shopping cart and then completes an order.There are authentication and authorization. User can have different roles: USER, ADMIN._

### _Implemented Cinema web application shows my skills in:_ 
 - Java 11 
 - Tomcat
 - Maven
 - Hibernate
 - Spring Web, Spring REST API, Spring Security
 - RDBMS (MySQL). <br><br>

### _Functionality of the service:_
`1 Without a role can: register`<br> 

`2 Admin can: create a new movie session, and also delete and update it add new cinema hall, movie find user by email`<br>

`3 A user can: add the ticket for the movie to the shopping cart complete the order view all tickets in the shopping cart and history of all the orders`<br>

### _Setup AND Usage_

1. Clone this project

2. Configure Tomcat Server

3. Setup new connection in "src/main/resources/db.properties"

4. Run project <br>
5. Open API testing tool, for example you can use the Postman. <br> <br>
  **_You can use next end points:_** <br>
  GET  - /cinema-halls, /movies, /movie-sessions/available, /movie-sessions/id - USER and ADMIN, <br> 
  GET  - /users/by-email?email - ADMIN, <br>
  GET  - /orders, /shopping-carts/by-user - USER; <br>
  POST - /register, /login- unauthorized, <br>
  POST - /cinema-halls, /movies, /movie-sessions - ADMIN, <br>
  POST - /orders/complete - USER role; <br>
  PUT  - /movie-sessions/id - ADMIN, <br>
  PUT  - /shopping-carts/movie-sessions?movieSessionId - USER; <br>
  DELETE - /movie-sessions/id - ADMIN. <br><br>

   **_Example for body params for POST and PUT requests:_** <br>
   POST /register: <br>
  `{"password" : "12345678", "repeatPassword" : "12345678", "email" : "email@gmail.com"}`<br> 
   POST /cinema-halls: <br>
   `{"capacity" : 100, "description" : "description"} ` <br>
   POST /movies: <br>
   `{"title" : "title", "description" : "description"}`<br>
   POST /movie-sessions: <br>
   `{"movieId" : 1, "cinemaHallId" : 1, "showTime" : "19.11.2021 12:00"}` <br><br>
   - Admin and User will be added to your database when program start. You can log in as: Admin: (name: "admin@gmail.com", password:"12345678"), or User: (name: "user@gmail.com", password:"87654321")