package constructors_and_access_modifiers.level2.employee_records;

public class Manager extends Employee{
    Manager(int employeeId, String department, int salary){
        super(employeeId, department, salary);
    }
    public void displayDetails(){
        System.out.println("EmployeeId: " + employeeID);
        System.out.println("Department: " + department);
    }
}