# Test Cases – Student Grade Management System

| Test Case ID | Requirement ID | Description       | Steps                | Expected Result            | Status |
| ------------ | -------------- | ----------------- | -------------------- | -------------------------- | ------ |
| TC-001       | FR-001         | Add student       | Enter details → Save | Student saved successfully | Pass   |
| TC-002       | FR-002         | Add subject       | Enter subject → Save | Subject saved              | Pass   |
| TC-003       | FR-003         | Capture grades    | Enter marks → Save   | Grade stored               | Pass   |
| TC-004       | FR-004         | Update grades     | Edit marks → Save    | Grade updated              | Pass   |
| TC-005       | FR-005         | Delete student    | Select → Delete      | Student removed            | Pass   |
| TC-006       | FR-006         | View grades       | Search student       | Grades displayed           | Pass   |
| TC-007       | FR-007         | Search student    | Enter ID             | Student found              | Pass   |
| TC-008       | FR-009         | Calculate average | View results         | Average displayed          | Pass   |

---

## Non-Functional Test Cases

### Performance Test

* Simulate multiple users accessing system
* Expected: Response time ≤ 2 seconds

### Security Test

* Attempt unauthorized access
* Expected: Access denied
