# **Spring Boot with MongoDB - Course Management System**

This project is a **Spring Boot** application that provides **CRUD operations** for managing courses using **MongoDB** as the database. The application is also integrated with **Eureka Server** for service discovery.

---

## **🛠 Project Structure**

```
src
│── main
│   ├── java
│   │   └── com.example.expt4_connecting_with_db
│   │       ├── controllers
│   │       │   ├── CourseController.java
│   │       ├── entities
│   │       │   ├── Course.java
│   │       ├── repositories
│   │       │   ├── CourseRepository.java
│   │       ├── services
│   │       │   ├── CourseService.java
│   │       │   ├── CourseServiceImpl.java
│   │       ├── Expt4ConnectingWithDbApplication.java
│   │       ├── EurekaServerApplication.java
│
├── resources
│   ├── application.properties
│   ├── data.sql (if needed)
│   ├── schema.sql (if needed)
│
└── pom.xml
```

---

## **🚀 Features**
- **CRUD operations** (Create, Read, Update, Delete) for courses.
- **Spring Data MongoDB** for database interactions.
- **RESTful APIs** using Spring Boot.
- **Eureka Server Integration** for service discovery.
- **Dependency Injection** using `@Autowired`.

---

## **📌 Technologies Used**
- **Java** (Spring Boot)
- **Spring Data MongoDB**
- **Spring Web**
- **Spring Boot Eureka**
- **Maven** (Build Tool)
- **Postman** (API Testing)

---

## **📝 API Endpoints**
| HTTP Method | Endpoint | Description |
|------------|---------|-------------|
| **GET** | `/courses` | Fetch all courses |
| **GET** | `/courses/{id}` | Fetch course by ID |
| **POST** | `/courses` | Add a new course |
| **PUT** | `/courses/{id}` | Update a course by ID |
| **DELETE** | `/courses/{id}` | Delete a course by ID |

---

## **📦 Installation & Setup**

### **1️⃣ Clone the repository**
```sh
git clone https://github.com/yourusername/your-repository.git
cd your-repository
```

### **2️⃣ Configure MongoDB**
Ensure that MongoDB is installed and running locally or update the **MongoDB URI** in `application.properties`:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/courseDB
```

### **3️⃣ Build & Run the Application**
```sh
mvn clean install
mvn spring-boot:run
---

## **🛠 Tools Required**
- Java JDK 17+
- Maven
- MongoDB
- IntelliJ IDEA / VS Code / Eclipse
- Postman (For API Testing)

---

## **💡 Contributing**
Feel free to submit a **pull request** or report issues if you find any bugs! 🚀

---

## **📜 License**
This project is licensed under the **MIT License**🚀.

---

 
