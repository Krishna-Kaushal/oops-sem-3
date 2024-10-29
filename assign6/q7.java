import java.util.regex.Pattern;

class Employee {
    // Fields
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    // Constructor
    public Employee(String employeeName, String employeeNumber, String hireDate) {
        this.employeeName = employeeName;
        setEmployeeNumber(employeeNumber); // Validate employee number format
        this.hireDate = hireDate;
    }

    // Accessor and Mutator Methods
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if (isValidEmployeeNumber(employeeNumber)) {
            this.employeeNumber = employeeNumber;
        } else {
            throw new IllegalArgumentException("Invalid employee number format.");
        }
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    // Helper method to validate employee number format
    private boolean isValidEmployeeNumber(String employeeNumber) {
        // Format: XXX{L, where X is a digit and L is a letter A-M
        return Pattern.matches("\\d{3}[A-M]", employeeNumber);
    }

    @Override
    public String toString() {
        return "Employee Name: " + employeeName + "\n" +
               "Employee Number: " + employeeNumber + "\n" +
               "Hire Date: " + hireDate;
    }
}

class ProductionWorker extends Employee {
    // Fields
    private int shift; // 1 for day shift, 2 for night shift
    private double hourlyPayRate;

    // Constructor
    public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(employeeName, employeeNumber, hireDate);
        setShift(shift); // Validate shift value
        this.hourlyPayRate = hourlyPayRate;
    }

    // Accessor and Mutator Methods
    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if (shift == 1 || shift == 2) {
            this.shift = shift;
        } else {
            throw new IllegalArgumentException("Invalid shift. Must be 1 (day) or 2 (night).");
        }
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        String shiftType = (shift == 1) ? "Day Shift" : "Night Shift";
        return super.toString() + "\n" +
               "Shift: " + shiftType + "\n" +
               "Hourly Pay Rate: $" + hourlyPayRate;
    }
}

public class q7 {
    public static void main(String[] args) {
        try {
            // Creating a ProductionWorker object
            ProductionWorker worker = new ProductionWorker(
                "Alice Johnson", "123A", "2024-01-15", 1, 25.50
            );

            // Displaying details of the ProductionWorker
            System.out.println(worker);

            // Creating another ProductionWorker object with invalid shift
            ProductionWorker workerInvalid = new ProductionWorker(
                "Bob Smith", "456B", "2024-02-20", 3, 20.00
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
