package Inheritance.Assisted_Problems.EmployeeManagementSystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Ankit", 1, 50000.522, 40);
        Employee e2 = new Developer("Jerry", 2, 45257.256, "Java");
        Employee e3 = new Intern("Shadow", 3, 38756.254, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}