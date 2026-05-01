public class Grade {
    private String gradeId;
    private int mark;
    private String status;

    public Grade(String gradeId, int mark) {
        this.gradeId = gradeId;
        this.mark = mark;
        this.status = "Recorded";
    }

    public int getMark() { return mark; }

    public void updateGrade(int mark) {
        this.mark = mark;
        this.status = "Updated";
    }
}
