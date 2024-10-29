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

class ShiftSupervisor extends Employee {
    // Fields
    private double annualSalary;
    private double annualBonus;

    // Constructor
    public ShiftSupervisor(String employeeName, String employeeNumber, String hireDate, double annualSalary, double annualBonus) {
        super(employeeName, employeeNumber, hireDate);
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    // Accessor and Mutator Methods
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Annual Salary: $" + annualSalary + "\n" +
               "Annual Bonus: $" + annualBonus;
    }
}

public class q8 {
    public static void main(String[] args) {
        // Creating a ShiftSupervisor object
        ShiftSupervisor supervisor = new ShiftSupervisor(
            "Michael Thompson", "789C", "2023-04-10", 75000.00, 5000.00
        );

        // Displaying details of the ShiftSupervisor
        System.out.println(supervisor);

        // Testing the mutator methods
        supervisor.setAnnualSalary(80000.00);
        supervisor.setAnnualBonus(5500.00);

        // Displaying updated details of the ShiftSupervisor
        System.out.println("\nUpdated Details:");
        System.out.println(supervisor);
    }
}

