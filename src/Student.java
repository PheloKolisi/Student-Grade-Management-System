public class Student {
    private String studentId;
    private String name;
    private String email;
    private String course;

    public Student(String studentId, String name, String email, String course) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }

    public void updateDetails(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
