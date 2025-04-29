package Encapsulation_Polymorphism_Interface_and_Abstract_Class.EmployeeManagement;

public class FullTimeEmployee extends Employee {
    private int workingHours;
    private int payRate;
    private String departmentName;

    public int getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public int getPayRate() {
        return payRate;
    }
    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public FullTimeEmployee(int employeeId, String employeeName, double baseSalary, int workingHours, int payRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
        this.payRate = payRate;
        this.departmentName = "Not Assigned";
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (payRate * workingHours);
    }

    @Override
    public void assignDepartment(String dept){
        setDepartmentName(dept);
    }

    @Override
    public void getDepartmentDetails(){
        System.out.println("Department Name: " + getDepartmentName());
    }
}