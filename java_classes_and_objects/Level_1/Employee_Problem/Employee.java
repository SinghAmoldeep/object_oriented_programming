package java_classes_and_objects.Level_1.Employee_Problem;

public class Employee {
    private final String name;
    private final int id;
    private final int salary;

    public Employee(String name , int id , int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void showDetails(){
        System.out.println("Employee name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee salary is : " + salary);
    }

}