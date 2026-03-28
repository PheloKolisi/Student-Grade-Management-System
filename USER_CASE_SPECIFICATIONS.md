## Use Case Specifications

### 1. Use Case: Add Student

**Actor:** Lecturer
**Description:** Adds a new student to the system

**Preconditions:**

* Lecturer is using the system

**Postconditions:**

* Student is saved in the database

**Basic Flow:**

1. Lecturer enters student details
2. System validates input
3. System stores student

**Alternative Flow:**

* Invalid input → system displays error

---

### 2. Use Case: Add Subject

**Actor:** Lecturer

**Basic Flow:**

1. Enter subject name
2. Save subject

---

### 3. Use Case: Capture Grades

**Actor:** Lecturer

**Preconditions:**

* Student and subject exist

**Postconditions:**

* Grade stored

**Basic Flow:**

1. Select student
2. Select subject
3. Enter marks
4. Save

**Alternative Flow:**

* Marks invalid → error

---

### 4. Use Case: View Grades

**Actor:** Lecturer / Student

**Basic Flow:**

1. Search student
2. System retrieves grades
3. Display results

---

### 5. Use Case: Update Grades

**Actor:** Lecturer

**Basic Flow:**

1. Select student
2. Edit marks
3. Save

---

### 6. Use Case: Delete Student

**Actor:** Lecturer

**Basic Flow:**

1. Select student
2. Delete record

---

### 7. Use Case: Generate Report

**Actor:** Admin

**Basic Flow:**

1. Select report option
2. System generates report

---

### 8. Use Case: Maintain System

**Actor:** IT Support

**Basic Flow:**

1. Monitor system
2. Fix issues
