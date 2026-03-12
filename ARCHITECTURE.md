# Student Grade Management System Architecture

## C4 Context Diagram

The context diagram shows how the main user interacts with the system.

```mermaid
C4Context
title Student Grade Management System - Context Diagram

Person(lecturer, "Lecturer", "Records and manages student grades")

System(system, "Student Grade Management System", "Stores and manages student academic records")

Rel(lecturer, system, "Captures grades and views student records")
```

## C4 Container Diagram

The container diagram shows the main components of the system and how they interact.

```mermaid
C4Container
title Student Grade Management System - Container Diagram

Person(lecturer, "Lecturer")

System_Boundary(system, "Student Grade Management System") {

Container(app, "Java Application", "Java", "Provides the user interface and system functionality")

Container(database, "Database", "MySQL", "Stores student information, subjects, and grades")

}

Rel(lecturer, app, "Uses")

Rel(app, database, "Reads and writes data")
```
