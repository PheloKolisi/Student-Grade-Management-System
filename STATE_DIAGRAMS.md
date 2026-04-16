# State Transition Diagrams – Student Grade Management System

---

## 1. Student

```mermaid
stateDiagram-v2
[*] --> Registered
Registered --> Active : Enrollment confirmed
Active --> Suspended : Misconduct
Suspended --> Active : Reinstated
Active --> Graduated : Completed studies
Graduated --> [*]
```

---

## 2. Grade

```mermaid
stateDiagram-v2
[*] --> Not_Recorded
Not_Recorded --> Recorded : Marks entered
Recorded --> Updated : Grade modified
Updated --> Approved : Verified
Approved --> Archived : End of semester
Archived --> [*]
```

---

## 3. Subject

```mermaid
stateDiagram-v2
[*] --> Created
Created --> Active : Assigned to students
Active --> Updated : Modified details
Updated --> Active
Active --> Archived : No longer offered
Archived --> [*]
```

---

## 4. User Account

```mermaid
stateDiagram-v2
[*] --> Created
Created --> Active : Account activated
Active --> Locked : Failed login attempts
Locked --> Active : Reset password
Active --> Deactivated : User removed
Deactivated --> [*]
```

---

## 5. Report

```mermaid
stateDiagram-v2
[*] --> Requested
Requested --> Generated : Data processed
Generated --> Reviewed : Verified
Reviewed --> Published : Released
Published --> Archived : Stored
Archived --> [*]
```

---

## 6. Assignment

```mermaid
stateDiagram-v2
[*] --> Created
Created --> Assigned : Given to students
Assigned --> Submitted : Student submits
Submitted --> Graded : Lecturer marks
Graded --> Closed : Finalized
Closed --> [*]
```

---

## 7. Enrollment

```mermaid
stateDiagram-v2
[*] --> Pending
Pending --> Confirmed : Approved
Confirmed --> Active : Student attends
Active --> Completed : Course finished
Active --> Dropped : Withdrawn
Completed --> [*]
Dropped --> [*]
```
