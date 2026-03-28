# Use Case Diagram – Student Grade Management System

## Use Case Diagram (Mermaid)

```mermaid
flowchart TD

Lecturer --> Add_Student
Lecturer --> Add_Subject
Lecturer --> Capture_Grades
Lecturer --> Update_Grades
Lecturer --> View_Grades

Student --> View_Grades

Admin --> Generate_Reports

Registrar --> View_Records

IT_Support --> Maintain_System

Developer --> Update_System

Capture_Grades --> Validate_Marks
View_Grades --> Retrieve_Records
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
