
package Inheritance.Hierarchical_Inheritance.SchoolSystem;

public class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
