
package Inheritance.Hierarchical_Inheritance.SchoolSystem;

public class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
