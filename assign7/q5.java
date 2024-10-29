// Abstract class Shape
abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract method to calculate area
    public abstract double area();

    // toString method to return the shape's name
    @Override
    public String toString() {
        return "Shape: " + shapeName;
    }
}

// Sphere class extending Shape
class Sphere extends Shape {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Implementing the area method (Surface Area of a Sphere)
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Implementing the area method (Area of a Rectangle)
    @Override
    public double area() {
        return length * width;
    }
}

// Cylinder class extending Shape
class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Implementing the area method (Surface Area of a Cylinder)
    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// PaintCalculator class to calculate paint required
class PaintCalculator {
    private static final double COVERAGE_PER_LITER = 10.0; // 1 liter covers 10 square units

    // Method to calculate paint needed for a shape
    public static double calculatePaintRequired(Shape shape) {
        return shape.area() / COVERAGE_PER_LITER;
    }
}

// Test class to demonstrate the functionality
public class q5 {
    public static void main(String[] args) {
        // Create instances of Sphere, Rectangle, and Cylinder
        Shape sphere = new Sphere(5);  // Radius = 5
        Shape rectangle = new Rectangle(4, 7);  // Length = 4, Width = 7
        Shape cylinder = new Cylinder(3, 10);  // Radius = 3, Height = 10

        // Display the shapes' details and paint required
        System.out.println(sphere.toString() + " - Area: " + sphere.area());
        System.out.println("Paint needed: " + PaintCalculator.calculatePaintRequired(sphere) + " liters\n");

        System.out.println(rectangle.toString() + " - Area: " + rectangle.area());
        System.out.println("Paint needed: " + PaintCalculator.calculatePaintRequired(rectangle) + " liters\n");

        System.out.println(cylinder.toString() + " - Area: " + cylinder.area());
        System.out.println("Paint needed: " + PaintCalculator.calculatePaintRequired(cylinder) + " liters");
    }
}
