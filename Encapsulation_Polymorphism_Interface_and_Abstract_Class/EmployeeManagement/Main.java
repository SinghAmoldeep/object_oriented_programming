package Encapsulation_Polymorphism_Interface_and_Abstract_Class.EmployeeManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee(1, "Netan", 49010.90, 8, 200);
        FullTimeEmployee f2 = new FullTimeEmployee(1, "Rishav", 59010.90, 13, 500);
        PartTimeEmployee p1 = new PartTimeEmployee(2, "Sahil", 19760.0, 2, 100);
        PartTimeEmployee p2 = new PartTimeEmployee(2, "Aman", 20430.0, 4, 90);

        f1.assignDepartment("Business");
        f2.assignDepartment("Engineering");
        p1.assignDepartment("Engineering");
        p2.assignDepartment("Technology");

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(f1);
        employees.add(f2);
        employees.add(p1);
        employees.add(p2);

        for (Employee e : employees) {
            System.out.println("Salary: " + e.calculateSalary());
            e.getDepartmentDetails();
        }

    }
}