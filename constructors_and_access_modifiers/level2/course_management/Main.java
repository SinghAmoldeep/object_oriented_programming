package constructors_and_access_modifiers.level2.course_management;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("JAVA Full Stack", 6, 1000);
        c1.displayCourseDetails();
        c1.updateInstituteName("Code Academy");
        c1.displayCourseDetails();
    }
}