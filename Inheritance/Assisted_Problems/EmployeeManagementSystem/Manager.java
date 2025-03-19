package Inheritance.Assisted_Problems.EmployeeManagementSystem;

public class Manager extends Employee{
    private int teamsize;

    public Manager(String name, int id, double salary, int teamsize) {
        super(name, id, salary);
        this.teamsize = teamsize;

    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("TeamSize : "+teamsize);
    }
}