
package Inheritance.Multlevel_Inheritance.EducationalCourse;

public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    int discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void display() {
        super.display();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
    }
}

