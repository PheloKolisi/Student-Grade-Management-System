# Domain Model – Student Grade Management System

## Overview

The domain model represents the key entities, attributes, methods, and relationships within the Student Grade Management System.

---

## Domain Entities

| Entity      | Attributes                       | Methods                           | Relationships                       |
| ----------- | -------------------------------- | --------------------------------- | ----------------------------------- |
| Student     | studentId, name, email, course   | register(), updateDetails()       | Enrolled in Subject, has Grades     |
| Subject     | subjectId, subjectName           | addSubject(), updateSubject()     | Has Students, linked to Grades      |
| Grade       | gradeId, mark, status            | calculateAverage(), updateGrade() | Belongs to Student and Subject      |
| UserAccount | userId, username, password, role | login(), logout()                 | Associated with Student or Lecturer |
| Lecturer    | lecturerId, name                 | assignGrades(), generateReport()  | Manages Students and Subjects       |
| Report      | reportId, date, content          | generateReport(), exportReport()  | Contains Student Grades             |
| Enrollment  | enrollmentId, status             | enrollStudent(), dropStudent()    | Links Student and Subject           |

---

## Relationships

* A **Student** can enroll in multiple **Subjects**.
* A **Subject** can have multiple **Students**.
* A **Grade** is associated with one **Student** and one **Subject**.
* A **Lecturer** manages multiple **Students** and **Subjects**.
* A **Report** contains multiple **Grades**.
* An **Enrollment** links a **Student** to a **Subject**.

---

## Business Rules

* A student can enroll in multiple subjects.
* A grade must be between 0 and 100.
* A student must be enrolled in a subject before receiving a grade.
* Only lecturers can assign or update grades.
* Reports can only be generated after grades are recorded.
