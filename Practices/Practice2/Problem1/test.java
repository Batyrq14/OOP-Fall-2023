package Problem1;

public class test {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student("John Doe", 12345);

        // Access and print student information
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Year of Study: " + student.getYearOfStudy());

        // Increment the year of study
        student.incrementYearOfStudy();

        // Print the updated year of study
        System.out.println("Updated Year of Study: " + student.getYearOfStudy());
    }
    
}
