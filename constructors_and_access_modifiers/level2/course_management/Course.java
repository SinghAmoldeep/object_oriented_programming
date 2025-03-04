
package constructors_and_access_modifiers.level2.course_management;

public class Course {
    private String courseName;
    private int duration;
    private int fee;
    private static String institutionName = "Tech Academy";
    Course(String courseName, int duration, int fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;

    }
    public void displayCourseDetails(){
        System.out.println("Course Name: " + courseName );
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institution Name: " + institutionName);
    }
    public void updateInstituteName(String newName){
        institutionName = newName;
    }


}