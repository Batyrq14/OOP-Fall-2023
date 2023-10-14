package Problem1;
public class Student {
    String name;
    private int id;
    int yearOfStudy;

    // Constructor with two parameters
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1; // Initialize yearOfStudy to 1 by default
    }

    // Method to get the student's name
    public String getName() {
        return this.name;
    }

    // Method to get the student's id
    public int getId() {
        return this.id;
    }

    // Method to increment the year of study
    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    // Method to get the current year of study
    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    
}
