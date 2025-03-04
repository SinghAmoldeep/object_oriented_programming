
package constructors_and_access_modifiers.level2.university_management_system;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA(){
        return CGPA;
    }
    public void modifyCGPA(double newCGPA){
        CGPA = newCGPA;
    }
}