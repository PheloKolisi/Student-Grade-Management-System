# Activity Diagrams – Student Grade Management System

---

## 1. Add Student

```mermaid
flowchart TD
Start --> Enter_Details
Enter_Details --> Validate
Validate -->|Valid| Save_Student
Validate -->|Invalid| Error
Save_Student --> End
Error --> End
```

---

## 2. Add Subject

```mermaid
flowchart TD
Start --> Enter_Subject
Enter_Subject --> Validate
Validate -->|Valid| Save_Subject
Validate -->|Invalid| Error
Save_Subject --> End
Error --> End
```

---

## 3. Capture Grades

```mermaid
flowchart TD
Start --> Select_Student
Select_Student --> Enter_Marks
Enter_Marks --> Validate
Validate -->|Valid| Save_Grade
Validate -->|Invalid| Error
Save_Grade --> End
Error --> End
```

---

## 4. View Grades

```mermaid
flowchart TD
Start --> Enter_Search
Enter_Search --> Retrieve_Data
Retrieve_Data --> Display_Grades
Display_Grades --> End
```

---

## 5. Update Grades

```mermaid
flowchart TD
Start --> Select_Record
Select_Record --> Edit_Grade
Edit_Grade --> Validate
Validate -->|Valid| Save_Changes
Validate -->|Invalid| Error
Save_Changes --> End
Error --> End
```

---

## 6. Delete Student

```mermaid
flowchart TD
Start --> Select_Student
Select_Student --> Confirm_Delete
Confirm_Delete -->|Yes| Delete_Record
Confirm_Delete -->|No| Cancel
Delete_Record --> End
Cancel --> End
```

---

## 7. Generate Report (Parallel Process ⭐)

```mermaid
flowchart TD
Start --> Fetch_Data
Fetch_Data --> Generate_Report

Generate_Report --> Save_Report
Generate_Report --> Send_Email

Save_Report --> End
Send_Email --> End
```

---

## 8. Login Process

```mermaid
flowchart TD
Start --> Enter_Credentials
Enter_Credentials --> Validate_Login
Validate_Login -->|Valid| Access_System
Validate_Login -->|Invalid| Error
Access_System --> End
Error --> End
```
