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

class TeamLeader extends ProductionWorker {
    // Fields
    private double monthlyBonus;
    private int requiredTrainingHours;
    private int attendedTrainingHours;

    // Constructor
    TeamLeader(String employeeName, String employeeNumber, String hireDate, int shift, double hourlyPayRate,
               double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours) {
        super(employeeName, employeeNumber, hireDate, shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
    }

    // Accessor and Mutator Methods
    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public int getAttendedTrainingHours() {
        return attendedTrainingHours;
    }

    public void setAttendedTrainingHours(int attendedTrainingHours) {
        this.attendedTrainingHours = attendedTrainingHours;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Monthly Bonus: $" + monthlyBonus + "\n" +
               "Required Training Hours: " + requiredTrainingHours + "\n" +
               "Attended Training Hours: " + attendedTrainingHours;
    }
}

public class q9 {
    public static void main(String[] args) {
        // Creating a TeamLeader object
        TeamLeader teamLeader = new TeamLeader(
            "Jessica Miller", "321D", "2022-07-01", 1, 30.00,
            1000.00, 40, 35
        );

        // Displaying details of the TeamLeader
        System.out.println(teamLeader);

        // Testing the mutator methods
        teamLeader.setMonthlyBonus(1200.00);
        teamLeader.setAttendedTrainingHours(45);

        // Displaying updated details of the TeamLeader
        System.out.println("\nUpdated Details:");
        System.out.println(teamLeader);
    }
}


