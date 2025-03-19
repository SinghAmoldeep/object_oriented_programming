
package Inheritance.Hierarchical_Inheritance.SchoolSystem;

public class SchoolSystem {
    public static void main(String[] args) {
        Person teacher = new Teacher("Ankit", 35, "Mathematics");
        Person student = new Student("Jerry", 16, 10);
        Person staff = new Staff("Shadow", 40, "Administration");

        System.out.println("=== Teacher Details ===");
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        System.out.println("=== Student Details ===");
        student.displayRole();
        student.displayDetails();
        System.out.println();

        System.out.println("=== Staff Details ===");
        staff.displayRole();
        staff.displayDetails();
    }
}
