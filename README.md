# Cab Booking API

A beginner-friendly Cab Booking REST API built using Java, Spring Boot, Spring Data JPA, Hibernate, and PostgreSQL.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- PostgreSQL
- Maven
- Postman for API testing

## Features

- Create a cab
- Retrieve all cabs
- Retrieve a cab by ID
- Update cab details
- Delete a cab
- Store cab information in PostgreSQL

## Database Configuration

1. Install PostgreSQL.
2. Create a database named `Carbookingminisys`.
3. Configure your database URL and username in `application.properties`.
4. Set the `DB_PASSWORD` environment variable to your PostgreSQL password.

Keep your database password private. Do not commit passwords or other secrets to GitHub.

## Run the Project

1. Clone or download this repository.
2. Open the project in Spring Tool Suite or another compatible Java IDE.
3. Configure the database connection.
4. Run `CabbookingApiApplication`.
5. The API runs at `http://localhost:8080`.

## API Endpoints

Base URL: `http://localhost:8080/cabs`

| Method | Endpoint | Purpose |
|---|---|---|
| POST | `/cabs` | Create a cab |
| GET | `/cabs` | Get all cabs |
| GET | `/cabs/{id}` | Get a cab by ID |
| PUT | `/cabs/{id}` | Update a cab |
| DELETE | `/cabs/{id}` | Delete a cab |

Use Postman to test the endpoints.

## Learning Objective

This project demonstrates REST API development, CRUD operations, database connectivity, and persistence using Spring Boot and PostgreSQL.