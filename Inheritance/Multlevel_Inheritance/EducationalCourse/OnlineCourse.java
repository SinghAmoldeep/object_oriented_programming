
package Inheritance.Multlevel_Inheritance.EducationalCourse;

public class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void display() {
        super.display();
        System.out.println("Platform: " + platform);
        System.out.println("isRecorded: " + isRecorded);
    }
}
