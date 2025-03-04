package java_classes_and_objects.Level_1.Circle_Problem;

public class Circle {
    double radius;
    Circle(float radius){
        this.radius=radius;
    }
    public void circumference(){
        System.out.println(3.14 *radius*radius);
    }
}