# 📚 Library Management System – Spring Boot REST API

A **Spring Boot RESTful API** built for hands-on learning that demonstrates clean layered architecture, DTO usage, and full CRUD operations including **partial updates using PATCH**.

This project is designed to follow **industry best practices** and is suitable for showcasing on a CV or GitHub portfolio.

---

## 🚀 Features

- Create, Read, Update, Delete (CRUD) operations on Books
- Partial update of resources using HTTP PATCH
- DTO pattern to prevent direct Entity exposure
- Layered architecture (Controller, Service, Repository)
- ModelMapper for DTO ↔ Entity conversion
- Lombok to reduce boilerplate code
- RESTful API design principles
- MySQL database integration

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **ModelMapper**
- **Lombok**
- **Maven**
- **Spring Boot DevTools**

---

## 🏗️ Project Architecture

src/main/java
└── com.sa
├── controller
│ └── BookController.java
├── service
│ ├── BookService.java
│ └── BookServiceImpl.java
├── repository
│ └── BookRepository.java
├── entity
│ └── Book.java
└── dto
├── BookDto.java
└── AddBookRequestDto.java

yaml
Copy code

---

## 📘 Entity Details

### Book Entity
- `id` → Auto-generated primary key
- `name` → Book name

---

## 🔁 API Endpoints

| HTTP Method | Endpoint | Description |
|------------|---------|-------------|
| GET | `/books` | Get all books |
| GET | `/books/{id}` | Get book by ID |
| POST | `/books` | Add a new book |
| PUT | `/books/{id}` | Full update of a book |
| PATCH | `/books/{id}` | Partial update of a book |
| DELETE | `/books/{id}` | Delete a book |

---

## 📌 Sample API Requests

### ➕ Create Book (POST)
```json
{
  "name": "Clean Code"
}
🔄 Full Update (PUT)
json
Copy code
{
  "name": "Effective Java"
}
✏️ Partial Update (PATCH)
json
Copy code
{
  "name": "Spring in Action"
}
⚙️ application.properties Configuration
Create your own application.properties file using the example below.

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
