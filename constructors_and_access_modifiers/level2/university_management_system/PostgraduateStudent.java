package constructors_and_access_modifiers.level2.university_management_system;

public class PostgraduateStudent extends Student{
    PostgraduateStudent(int rollNumber, String name, double CGPA){
        super(rollNumber, name, CGPA);
    }
    public void displayDetails(){
        System.out.println("Roll Number:" + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}