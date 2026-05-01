public class StudentBuilder {
    private String id;
    private String name;
    private String email;
    private String course;

    public StudentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public Student build() {
        return new Student(id, name, email, course);
    }
}
