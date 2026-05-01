public class Main {
    public static void main(String[] args) {

        // ==============================
        // 1. Simple Factory
        // ==============================
        Student student1 = StudentFactory.createStudent("Undergrad");
        System.out.println("Factory Student: " + student1);

        // ==============================
        // 2. Builder Pattern
        // ==============================
        Student student2 = new StudentBuilder()
                .setId("3")
                .setName("Alice")
                .setEmail("alice@mail.com")
                .setCourse("Computer Science")
                .build();

        System.out.println("Built Student: " + student2);

        // ==============================
        // 3. Singleton Pattern
        // ==============================
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        if (db1 == db2) {
            System.out.println("Singleton works: Only one instance exists");
        }

        // ==============================
        // 4. Prototype Pattern
        // ==============================
        try {
            StudentPrototype original = new StudentPrototype("John");
            StudentPrototype copy = (StudentPrototype) original.clone();

            System.out.println("Original: " + original.getName());
            System.out.println("Cloned: " + copy.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // ==============================
        // 5. Factory Method
        // ==============================
        ReportCreator creator = new StudentReportCreator();
        Report report = creator.createReport();
        report.generateReport();

        // ==============================
        // 6. Abstract Factory
        // ==============================
        UserFactory factory = new ConcreteUserFactory();
        Student s = factory.createStudent();
        Lecturer l = factory.createLecturer();

        System.out.println("Abstract Factory Student: " + s.getName());
        l.assignGrade(new Grade("G1", 80), 90);

        System.out.println("System execution completed successfully!");
    }
}
