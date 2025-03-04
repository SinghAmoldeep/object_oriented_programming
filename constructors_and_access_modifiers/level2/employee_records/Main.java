
package constructors_and_access_modifiers.level2.employee_records;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "HR", 90000);
        m1.displayDetails();
        m1.displaySalary();
    }
}