import java.util.Scanner;

class Circle {
    // fields
    public double radius;
    public double pi = 3.14159;

    // constructor 
    public Circle() {
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // mutators
    public void setRadius (double radius) {
        this.radius = radius;
    }

    // accessors
    public double getRadius () {return radius;}

    // methods
    public double getArea() {return pi*radius*radius;}
    public double getDiameter() {return 2*radius;}
    public double getCircumference() {return 2*pi*radius;}
}

public class q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle c1 = new Circle (radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getDiameter());
        System.out.println(c1.getCircumference());
    }
}