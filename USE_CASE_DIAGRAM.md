# Use Case Diagram – Student Grade Management System

## Use Case Diagram (Mermaid)

```mermaid
%%{init: {'theme': 'default'}}%%
flowchart TD

actor Lecturer
actor Student
actor Admin
actor Registrar
actor IT_Support
actor Developer

Lecturer --> (Add Student)
Lecturer --> (Add Subject)
Lecturer --> (Capture Grades)
Lecturer --> (Update Grades)
Lecturer --> (View Grades)

Student --> (View Grades)

Admin --> (Generate Reports)

Registrar --> (View Records)

IT_Support --> (Maintain System)

Developer --> (Update System)

(Capture Grades) --> (Validate Marks) : <<include>>
(View Grades) --> (Retrieve Records) : <<include>>
```

---

## Explanation

### Key Actors

* **Lecturer**: Main user who captures and manages grades.
* **Student**: Views academic results.
* **Admin**: Generates reports.
* **Registrar**: Manages official records.
* **IT Support**: Maintains system performance.
* **Developer**: Updates and improves the system.

### Relationships

* **Include Relationship**:

  * "Capture Grades" includes "Validate Marks" to ensure correct data entry.
  * "View Grades" includes "Retrieve Records" to fetch stored data.

### Stakeholder Alignment

This diagram supports:

* Lecturers → fast grade capturing
* Students → access to results
* Admin → reporting
* IT → maintainability
