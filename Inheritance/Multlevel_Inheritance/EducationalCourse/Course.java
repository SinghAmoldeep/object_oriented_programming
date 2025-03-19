package Inheritance.Multlevel_Inheritance.EducationalCourse;

public class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}