# micro-service-springboot-app
This project is a production-ready microservices architecture built using Spring Boot, following modern backend development best practices. It demonstrates how independent services can communicate seamlessly while remaining loosely coupled and scalable. User Service –  Hotel Service – Rating Service – Stores and manages user ratings for hotels
🏨 Microservices-Based Hotel Rating System

A scalable and production-ready microservices application built using Spring Boot and Spring Cloud, demonstrating real-world microservices design patterns such as service discovery, inter-service communication, centralized configuration, API gateway, and fault tolerance.

📌 Project Overview

This project simulates a Hotel Rating Platform where users can view hotels and submit ratings.
The system is designed using independent microservices that communicate with each other while remaining loosely coupled and scalable.

🧩 Microservices in This Project
1️⃣ User Service

Manages user information

Fetches user details along with hotel ratings

Communicates with Rating and Hotel services

2️⃣ Hotel Service

Manages hotel data

Provides hotel details to other services

Independent database and deployment

3️⃣ Rating Service

Stores user ratings for hotels

Provides rating data for aggregation

Fully decoupled from User & Hotel services

🏗️ System Architecture
Client
  |
API Gateway
  |
----------------------------
|        |               |
User   Rating         Hotel
Service Service       Service

🔹 Architecture Highlights

API Gateway handles routing and request filtering

Eureka Server enables service discovery

Feign Clients simplify inter-service communication

Config Server centralizes configuration

Resilience4J provides fault tolerance

⚙️ Key Features

Microservices-based architecture

RESTful APIs

Service Discovery with Eureka

API Gateway for centralized access

Inter-service communication using Feign

Circuit Breaker, Retry & Rate Limiter

Database per service pattern

Clean layered architecture

Cloud-ready and scalable design

🛠️ Tech Stack
Category	Technology
Language	Java
Framework	Spring Boot
Cloud Tools	Spring Cloud
Service Discovery	Eureka Server
Communication	OpenFeign
Gateway	Spring Cloud Gateway
Resilience	Resilience4J
Database	MySQL
Build Tool	Maven
Version Control	Git & GitHub
🚀 How to Run the Project
Prerequisites

Java 17+

Maven

MySQL

Git

Steps

Clone the repository

git clone <repo-url>


Start Eureka Server

Start Config Server

Run services in order:

User Service

Rating Service

Hotel Service

Start API Gateway

Access APIs through the Gateway

🎯 Use Case Example

Create users

Add hotels

Submit ratings

Fetch user details with ratings and hotel info

This mimics real enterprise backend systems.

📚 Learning Outcomes

Designing scalable microservices

Implementing service discovery

Handling inter-service communication

Building fault-tolerant systems

Applying Spring Cloud best practices

💼 Ideal For

Backend developers learning microservices

Spring Boot professionals

System design interviews

Portfolio & resume projects

✨ Future Enhancements

Authentication & Authorization (JWT / OAuth2)

Docker & Kubernetes support

Distributed tracing (Zipkin)

CI/CD integration

👨‍💻 Author

Ravi Maurya
Java | Spring Boot | Microservices | Full Stack Developer
