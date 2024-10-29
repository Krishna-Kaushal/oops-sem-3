// Shape interface with two methods
interface Shape {
    double getArea();
    double getPerimeter();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing getArea method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Implementing getPerimeter method
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing getArea method
    @Override
    public double getArea() {
        return length * width;
    }

    // Implementing getPerimeter method
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implementing getArea method using Heron's formula
    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Implementing getPerimeter method
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}

// Test class to demonstrate functionality
public class q4 {
    public static void main(String[] args) {
        // Create and demonstrate Circle
        Shape circle = new Circle(5);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Create and demonstrate Rectangle
        Shape rectangle = new Rectangle(4, 7);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        // Create and demonstrate Triangle
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
