package constructors_and_access_modifiers.level1.circle_radius;

public class Circle {
    private double radius;
    Circle(){
        this(1.0);
    }
    Circle(double radius){
        this.radius = radius;
    }
    public void getRadius(){
        System.out.println(radius);
    }

}