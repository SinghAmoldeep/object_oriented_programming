
package object_oriented_design_principles.UniversityManagement;

public class Main {
    public static void main(String[] args) {
        Course maths = new Course("Maths");

        Professor p1 = new Professor("Jack", "CSE");

        Student s1 = new Student("Rishav", 22);
        Student s2 = new Student("Sahil", 21);

        s1.enrollCourse(maths);
        s2.enrollCourse(maths);

        p1.assignProfessor(maths);

        System.out.println(maths.getProfessor().getName());
    }
}
