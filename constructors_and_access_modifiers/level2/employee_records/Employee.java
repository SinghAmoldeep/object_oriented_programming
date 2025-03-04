package constructors_and_access_modifiers.level2.employee_records;

public class Employee {
    public int employeeID;
    protected String department;
    private int salary;
    Employee(int employeeID, String department, int salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void ModifySalary(int newSalary){
        salary = newSalary;
    }
    public void displaySalary(){
        System.out.println(salary);
    }
}