🏨 Microservices-Based Hotel Rating System

A robust, scalable, and production-oriented microservices application built using Spring Boot and Spring Cloud, showcasing service discovery, inter-service communication, and fault-tolerant design following industry best practices.

📌 Project Overview

This project implements a distributed microservices architecture where independent services communicate dynamically using Eureka Service Registry and OpenFeign Clients, eliminating tight coupling and hard-coded service URLs.

The application simulates a hotel rating platform, enabling users to rate hotels and retrieve aggregated information across multiple services.

🧩 Microservices Included
1️⃣ User Service

Manages user profiles and details

Uses Feign Client to communicate with Rating and Hotel services

Aggregates hotel and rating data dynamically via Eureka discovery

2️⃣ Hotel Service

Manages hotel information and metadata

Registers with Eureka Server for service discovery

3️⃣ Rating Service

Stores and manages user ratings

Provides rating data to User Service via Feign Client

🏗️ System Architecture

Eureka Server – Centralized service registry for dynamic service discovery

OpenFeign Client – Declarative REST client for inter-service communication

API Gateway – Single entry point for all client requests

Spring Cloud Config Server – Centralized configuration management

Resilience4J – Fault tolerance and resilience patterns

All services register themselves with Eureka, and communication happens via service names, not fixed URLs.

⚙️ Key Features

Microservices architecture using Spring Boot

Service Registry & Discovery using Eureka Server

Inter-service communication using OpenFeign Clients

Dynamic load-balanced service calls

API Gateway for request routing

Centralized configuration with Config Server

Circuit Breaker, Retry & Rate Limiter (Resilience4J)

Database-per-service pattern

RESTful API design

Clean layered architecture (Controller, Service, Repository)

Scalable and cloud-ready design

🛠️ Tech Stack
Category	Technology
Language	Java
Framework	Spring Boot, Spring Cloud
Service Registry	Eureka Server
Inter-Service Communication	OpenFeign
API Gateway	Spring Cloud Gateway
Configuration	Spring Cloud Config
Database	MySQL
Resilience	Resilience4J
Build Tool	Maven
Version Control	Git & GitHub
🗂️ Project Structure
├── user-service
├── hotel-service
├── rating-service
├── api-gateway
├── service-registry (Eureka Server)
└── config-server


Each service:

Registers with Eureka Server

Uses Feign Client for communication

Has its own database and configuration

🚀 How to Run the Project
Prerequisites

Java 17+

Maven

MySQL

Git

Startup Order

Config Server

Service Registry (Eureka Server)

API Gateway

Hotel Service

Rating Service

User Service

Eureka Dashboard
http://localhost:8761

🔁 Service Communication Flow

Client sends request to API Gateway

Gateway routes request to User Service

User Service uses Feign Client

Feign resolves service location via Eureka

Rating & Hotel services respond

Aggregated response returned to client

🎯 Learning Outcomes

Hands-on experience with Eureka-based service discovery

Implementing Feign-based service communication

Designing loosely coupled microservices

Building fault-tolerant distributed systems

Applying Spring Cloud patterns in real-world projects

💼 Ideal For

Java Backend Developers

Spring Boot Microservices Learners

Interview & Portfolio Projects

Enterprise System Design Demonstrations

📬 Contact

Developer: Ravi Maurya
Role: Java Full-Stack Developer
Skills: Java, Spring Boot, Microservices, React, MySQL, AWS

