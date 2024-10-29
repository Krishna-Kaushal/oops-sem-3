class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Box extends Rectangle {
    double height;

    Box(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    double getVolume() {
        return length * breadth * height;
    }

    double getSurfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}

public class q3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Box box = new Box(5, 3, 4);
        System.out.println("Box Volume: " + box.getVolume());
        System.out.println("Box Surface Area: " + box.getSurfaceArea());
    }
}
