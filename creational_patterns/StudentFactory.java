public class StudentFactory {
    public static Student createStudent(String type) {
        if (type.equalsIgnoreCase("Undergrad")) {
            return new Student("1", "Undergrad Student", "u@mail.com", "BSc");
        } else if (type.equalsIgnoreCase("Postgrad")) {
            return new Student("2", "Postgrad Student", "p@mail.com", "MSc");
        }
        return null;
    }
}
