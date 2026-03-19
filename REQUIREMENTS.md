# System Requirements Document (SRD)

## Functional Requirements

1. The system shall allow lecturers to add new student records.

2. The system shall allow lecturers to add subjects to the system.

3. The system shall allow lecturers to capture student grades for specific subjects.

4. The system shall allow lecturers to update student grades.

5. The system shall allow lecturers to delete student records.

6. The system shall allow lecturers to view all student grade records.

7. The system shall allow lecturers to search for students by student ID or name.

8. The system shall display all subjects associated with a student.

9. The system shall calculate the average grade for each student.

10. The system shall generate a report showing student grades.

### Acceptance Criteria Example

Requirement: Capture Student Grades

Acceptance Criteria:

* The lecturer must be able to enter a numeric grade between 0 and 100.
* The system must store the grade in the database.
* The system must display the grade when the student record is viewed.

---

## Non-Functional Requirements

### Usability

1. The system interface shall be simple and easy to use for lecturers with basic computer skills.

### Deployability

2. The system shall be deployable on computers running Windows operating systems.

### Maintainability

3. The system code shall be modular to allow easy updates and maintenance.

### Scalability

4. The system shall support at least 500 student records without performance degradation.

### Security

5. Access to the system shall require user authentication.

6. Student academic records shall be stored securely in the database.

### Performance

7. The system shall retrieve student records within 2 seconds.

8. The system shall save student grades to the database within 1 second.
