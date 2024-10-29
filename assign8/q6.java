class NegativePriceException extends Exception {
    // Constructor that takes a message as input
    public NegativePriceException(String message) {
        super(message);
    }
}

class NegativeUnitsOnHandException extends Exception {
    // Constructor that takes a message as input
    public NegativeUnitsOnHandException(String message) {
        super(message);
    }
}

class RetailItem {
    // Fields
    private String description;
    private int unitsOnHand;
    private double price;

    // Constructor
    public RetailItem(String description, int unitsOnHand, double price) throws NegativePriceException, NegativeUnitsOnHandException {
        // Using mutators for validation
        setDescription(description);
        setUnitsOnHand(unitsOnHand);
        setPrice(price);
    }

    // Accessor methods (Getters)
    public String getDescription() {
        return description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    // Mutator methods (Setters)
    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitsOnHand(int unitsOnHand) throws NegativeUnitsOnHandException {
        if (unitsOnHand < 0) {
            throw new NegativeUnitsOnHandException("Units on hand cannot be negative: " + unitsOnHand);
        }
        this.unitsOnHand = unitsOnHand;
    }

    public void setPrice(double price) throws NegativePriceException {
        if (price < 0) {
            throw new NegativePriceException("Price cannot be negative: " + price);
        }
        this.price = price;
    }
}

public class q6 {
    public static void main(String[] args) {
        try {
            // Creating three RetailItem objects with valid data
            RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
            RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
            RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

            // Displaying details of the items
            displayItem(item1);
            displayItem(item2);
            displayItem(item3);

        } catch (NegativePriceException | NegativeUnitsOnHandException e) {
            // Handling exceptions if thrown
            System.out.println(e.getMessage());
        }

        // Example of exception being triggered:
        try {
            // Attempting to create an item with a negative price
            RetailItem invalidItem = new RetailItem("Shoes", 10, -49.99);
        } catch (NegativePriceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NegativeUnitsOnHandException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Attempting to create an item with negative units on hand
            RetailItem invalidItem2 = new RetailItem("Hat", -5, 19.99);
        } catch (NegativePriceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NegativeUnitsOnHandException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Helper method to display item details
    public static void displayItem(RetailItem item) {
        System.out.println("Description: " + item.getDescription());
        System.out.println("Units on Hand: " + item.getUnitsOnHand());
        System.out.println("Price: $" + item.getPrice());
        System.out.println();
    }
}
