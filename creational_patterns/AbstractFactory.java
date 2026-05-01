interface UserFactory {
    Student createStudent();
    Lecturer createLecturer();
}

class ConcreteUserFactory implements UserFactory {

    public Student createStudent() {
        return new Student("1", "John", "john@mail.com", "IT");
    }

    public Lecturer createLecturer() {
        return new Lecturer("L1", "Dr Smith");
    }
}
