# User Management API

REST API developed with Java and Spring Boot for user management.

## 🚀 Technologies

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven

## 📌 Features

* Create user
* List users
* Update user
* Delete user

## 📡 API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| GET    | /users      | List all users |
| POST   | /users      | Create user    |
| PUT    | /users/{id} | Update user    |
| DELETE | /users/{id} | Delete user    |

## 📂 Project Structure

src
┣ controller
┣ model
┣ repository

## 🧪 Example Request

POST /users

```json
{
"name": "Amanda",
"email": "amanda@email.com"
}
```

## How to run

git clone https://github.com/amarquesa/user-management-api
cd user-management-api
mvn spring-boot:run

## 👩‍💻 Author

Amanda Evelyn Marques
