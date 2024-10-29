class Employee {
    private int employeeId;
    private String employeeName;
    private String fatherName;
    private String address;
    private String dateOfBirth;
    private String designation;
    private double hourlyRate;
    private double maxPayment;

    public Employee(int employeeId, String employeeName, String fatherName, String address, String dateOfBirth, String designation, double hourlyRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.fatherName = fatherName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.designation = designation;
        this.hourlyRate = hourlyRate;
        this.maxPayment = hourlyRate * 100; // Calculate maximum payment for 100 hours
    }

    // Getters and setters for each field
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
        this.maxPayment = hourlyRate * 100; // Recalculate maxPayment if hourly rate changes
    }

    public double getMaxPayment() {
        return maxPayment;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + employeeName + ", Father: " + fatherName +
                ", Address: " + address + ", DOB: " + dateOfBirth + ", Designation: " + designation +
                ", Hourly Rate: $" + hourlyRate + ", Max Payment: $" + maxPayment;
    }
}

class EmployeeDatabase {
    private Employee[] employees;
    private int count;

    public EmployeeDatabase() {
        employees = new Employee[100];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < 100) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Database is full. Cannot add more employees.");
        }
    }

    public void displayEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getEmployeeById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }
        return null; // If employee with the given ID is not found
    }

    // We can add more methods to update or delete employees as needed
}

public class q1 {
    public static void main(String[] args) {
        EmployeeDatabase db = new EmployeeDatabase();

        // Creating some employee objects
        Employee emp1 = new Employee(1, "John Doe", "Robert Doe", "123 Elm St", "1990-01-01", "Software Engineer", 50);
        Employee emp2 = new Employee(2, "Jane Smith", "Alan Smith", "456 Oak St", "1985-05-15", "Project Manager", 75);

        // Adding employees to the database
        db.addEmployee(emp1);
        db.addEmployee(emp2);

        // Displaying all employees
        db.displayEmployees();

        // Retrieve an employee by ID
        Employee emp = db.getEmployeeById(1);
        if (emp != null) {
            System.out.println("Retrieved Employee: " + emp);
        } else {
            System.out.println("Employee not found.");
        }
    }
}

