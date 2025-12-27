# springRestApiwithDatabase
A Spring REST API practice project demonstrating clean layered architecture and database integration using Spring Boot + Spring Data JPA.  This project focuses on real-world REST API structure, CRUD operations, and best practices used in backend development.
📌 Project Overview

Project Name: springRestApiwithDatabase
Type: Backend REST API
Purpose: Practice Spring REST with database integration

🛠️ Technologies Used

Java 21

Spring Boot

Spring REST

Spring Data JPA

Hibernate

MySQL

Maven

Postman (API Testing)

📂 Project Structure
com.example.RestApiwithDatabase
│
├── entity          → JPA Entity classes
├── Repository      → Spring Data JPA Repositories
├── service         → Service interfaces
├── service.impl    → Business logic implementation
├── rest            → REST Controllers
├── Exception       → Custom exception handling


This structure follows industry-standard layered architecture:

Controller → Service → Repository → Database
🔗 Sample REST Endpoints
Method	Endpoint	Description
POST	/products	Add new product
GET	/products	Get all products
GET	/products/{id}	Get product by ID

🧪 API Testing

All APIs are tested using Postman with JSON request/response.

Sample Request Body
{
  "name": "Boat Headphones",
  "category": "Electronics",
  "price": 1299,
  "quantity": 50,
  "brand": "Boat",
  "available": true
}

⚙️ How to Run the Project

Clone the repository

git clone https://github.com/your-username/springRestApiwithDatabase.git


Import into IDE (STS / IntelliJ / Eclipse)

Configure database in application.properties

Run as Spring Boot Application

Test APIs using Postman
