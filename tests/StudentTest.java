public class StudentTest {
    public static void main(String[] args) {

        // Test Student Creation
        Student s = new Student("1", "John", "john@mail.com", "IT");
        System.out.println("Student: " + s.getName());

        // Test Builder
        Student built = new StudentBuilder()
                .setId("2")
                .setName("Alice")
                .setEmail("alice@mail.com")
                .setCourse("CS")
                .build();

        System.out.println("Built Student: " + built.getName());

        // Test Singleton
        DatabaseConnection d1 = DatabaseConnection.getInstance();
        DatabaseConnection d2 = DatabaseConnection.getInstance();

        if (d1 == d2) {
            System.out.println("Singleton works!");
        }
    }
}
