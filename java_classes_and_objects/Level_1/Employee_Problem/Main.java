package java_classes_and_objects.Level_1.Employee_Problem;

public class Main {

    public static void main(String[] args) {

        Employee emp1=new Employee("Rishav", 1167, 45000);
        Employee emp2=new Employee("Sahil", 1228, 40000);

        emp1.showDetails();
        emp2.showDetails();
    }
}