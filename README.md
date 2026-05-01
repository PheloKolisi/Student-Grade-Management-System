# Student Grade Management System

## Project Description

The Student Grade Management System is a software system designed to help lecturers manage and record student academic grades efficiently. The system allows lecturers to store student information, record marks for different subjects, and view student grade records.

This system aims to simplify the process of managing academic performance data and reduce manual record keeping.

## Project Domain

Education

The system operates within the education domain and is intended for use by lecturers or academic administrators who need to manage student academic records.

## Project Links

* [System Specification](SPECIFICATION.md)
* [System Architecture](ARCHITECTURE.md)

## Expected System Features

* Add student information
* Add subjects
* Capture student grades
* View student grade records
* Update student grades
* Delete student records

## Technology (Planned)

* Java
* MySQL
* JDBC

## Assignment 10 – Implementation

### Overview
This project implements a **Student Grade Management System** using Java and applies object-oriented design principles and creational design patterns.

---

## Project Structure

- `src/` → Core system classes (Student, Grade, Subject, etc.)
- `creational_patterns/` → Implementation of creational design patterns
- `tests/` → Basic test cases
- `Main.java` → Demonstrates system execution

---

## Creational Design Patterns Implemented

### 1. Simple Factory
Used to create different types of students (e.g., Undergraduate, Postgraduate) without exposing instantiation logic.

### 2. Factory Method
Used to create reports through a common interface, allowing flexibility in report generation.

### 3. Abstract Factory
Used to create related objects such as Student and Lecturer through a single factory.

### 4. Builder Pattern
Used to construct complex Student objects step-by-step.

### 5. Prototype Pattern
Used to clone existing student objects efficiently.

### 6. Singleton Pattern
Used to ensure only one instance of the database connection exists.

---

## Running the Project

This project can be executed using any Java environment or online platforms such as Replit.

The `Main.java` file demonstrates the functionality of all implemented patterns.

---
## Project History

- [Changelog](CHANGELOG.md)
## Key Features

- Object-Oriented Design
- Clean separation of concerns
- Use of multiple design patterns
- Modular and maintainable code structure
