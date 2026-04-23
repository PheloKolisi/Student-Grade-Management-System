# Class Diagram – Student Grade Management System

## Mermaid Class Diagram

```mermaid
classDiagram

class Student {
    -studentId: String
    -name: String
    -email: String
    -course: String
    +register()
    +updateDetails()
}

class Subject {
    -subjectId: String
    -subjectName: String
    +addSubject()
    +updateSubject()
}

class Grade {
    -gradeId: String
    -mark: int
    -status: String
    +calculateAverage()
    +updateGrade()
}

class UserAccount {
    -userId: String
    -username: String
    -password: String
    -role: String
    +login()
    +logout()
}

class Lecturer {
    -lecturerId: String
    -name: String
    +assignGrades()
    +generateReport()
}

class Report {
    -reportId: String
    -date: Date
    -content: String
    +generateReport()
    +exportReport()
}

class Enrollment {
    -enrollmentId: String
    -status: String
    +enrollStudent()
    +dropStudent()
}

Student "1" -- "0..*" Grade : has
Subject "1" -- "0..*" Grade : contains
Student "1" -- "0..*" Enrollment : enrolls
Subject "1" -- "0..*" Enrollment : includes
Lecturer "1" -- "0..*" Student : manages
Lecturer "1" -- "0..*" Subject : teaches
Report "1" -- "0..*" Grade : includes
UserAccount "1" -- "1" Student : linkedTo
```

---

## Explanation

The class diagram represents the structure of the system using object-oriented principles.

* **Encapsulation** is applied by defining attributes and methods within each class.
* **Associations** show relationships such as Student–Grade and Subject–Enrollment.
* **Multiplicity** defines how many objects are related (e.g., one student can have many grades).
* **Separation of concerns** ensures each class has a specific responsibility.

This design aligns with system requirements and supports scalability and maintainability.
