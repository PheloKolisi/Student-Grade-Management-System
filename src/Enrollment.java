public class Enrollment {
    private String enrollmentId;
    private String status;

    public Enrollment(String enrollmentId) {
        this.enrollmentId = enrollmentId;
        this.status = "Pending";
    }

    public void enrollStudent() {
        status = "Enrolled";
    }

    public void dropStudent() {
        status = "Dropped";
    }
}
