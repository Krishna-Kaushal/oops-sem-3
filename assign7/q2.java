// Vehicle interface with three methods
interface Vehicle {
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

// Bike class implementing Vehicle interface
class Bike implements Vehicle {
    private int gear;
    private int speed;

    // Constructor to initialize Bike
    public Bike() {
        this.gear = 1;
        this.speed = 0;
    }

    // Implementing changeGear method
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Bike gear changed to: " + gear);
    }

    // Implementing speedUp method
    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bike speed increased to: " + speed);
    }

    // Implementing applyBrakes method
    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Bike speed decreased to: " + speed);
    }
}

// Bicycle class implementing Vehicle interface
class Bicycle implements Vehicle {
    private int gear;
    private int speed;

    // Constructor to initialize Bicycle
    public Bicycle() {
        this.gear = 1;
        this.speed = 0;
    }

    // Implementing changeGear method
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Bicycle gear changed to: " + gear);
    }

    // Implementing speedUp method
    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed increased to: " + speed);
    }

    // Implementing applyBrakes method
    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Bicycle speed decreased to: " + speed);
    }
}

// Test class to demonstrate the functionality
public class q2 {
    public static void main(String[] args) {
        // Create Bike object and demonstrate functionality
        Vehicle myBike = new Bike();
        System.out.println("Bike Operations:");
        myBike.changeGear(2);
        myBike.speedUp(20);
        myBike.applyBrakes(5);
        System.out.println();

        // Create Bicycle object and demonstrate functionality
        Vehicle myBicycle = new Bicycle();
        System.out.println("Bicycle Operations:");
        myBicycle.changeGear(3);
        myBicycle.speedUp(15);
        myBicycle.applyBrakes(7);
    }
}
