package Encapsulation_Polymorphism_Interface_and_Abstract_Class.EmployeeManagement;

public abstract class Employee implements IDepartment {
    int employeeId;
    String employeeName;
    double baseSalary;

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Base Salary: " + baseSalary);
    }

}