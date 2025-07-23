# 📚 Bookstore API

A robust and cleanly designed RESTful API built using **Java**, **Spring Boot**, and **H2 Database** to manage a bookstore system. This API enables efficient CRUD operations for books and authors, and includes API documentation and testing utilities.

---

## 🚀 Key Features

- Full CRUD support for books and authors
- Pagination, sorting, and filtering capabilities
- Auto-generated API docs with Swagger (OpenAPI)
- Lightweight in-memory H2 database for quick setup
- Postman collection for easy endpoint testing

---

## 🧰 Technology Stack

- Java 17+
- Spring Boot 3.5.3
- Spring Web & Data JPA
- H2 Database
- springdoc-openapi for Swagger UI
- Postman for API testing

---

## 📁 Project Layout

```
bookstore-api/
├── src/                       # Source code
├── pom.xml                   # Maven configuration
├── README.md                 # Project documentation
└── bookstore-postman-collection-v2.json (optional)
```

---

## 🧪 How to Run

Using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

Or with Maven:

```bash
mvn spring-boot:run
```

---

## 🌐 Access Points

- Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## 📬 Postman API Collection

The project includes a Postman collection JSON file for testing the API endpoints. You can import the file named:

```
bookstore-postman-collection-v2.json
```

Into Postman and begin testing.

---

## 🙋 Author

Created as part of an internship project for**Elevate Labs** to demonstrate backend development skills using Spring Boot and REST principles.

---

## 📜 License

This project is open-source 

---
