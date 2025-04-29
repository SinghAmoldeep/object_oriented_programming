package Encapsulation_Polymorphism_Interface_and_Abstract_Class.OnlineFoodDelivery;
import java.util.*;

class LineCls {
    private int x1, y1, x2, y2;

    public LineCls(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

class LineComparison {
    public static void compareLines(LineCls line1, LineCls line2) {
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        if (length1 == length2) {
            System.out.println("Both lines are equal in length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }
    }
}

public class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.println("Enter coordinates for Line 2 (x3 y3 x4 y4):");
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        int x4 = sc.nextInt(), y4 = sc.nextInt();

        LineCls line1 = new LineCls(x1, y1, x2, y2);
        LineCls line2 = new LineCls(x3, y3, x4, y4);

        LineComparison.compareLines(line1, line2);
    }
}