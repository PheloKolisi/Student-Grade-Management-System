public class Lecturer {
    private String lecturerId;
    private String name;

    public Lecturer(String lecturerId, String name) {
        this.lecturerId = lecturerId;
        this.name = name;
    }

    public void assignGrade(Grade grade, int mark) {
        grade.updateGrade(mark);
    }
}
