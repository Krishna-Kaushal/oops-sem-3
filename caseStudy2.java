import java.io.*;
import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    protected String name;
    protected int employeeID;
    protected double salary;

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Abstract method to be overridden in subclasses
    public abstract void calculateSalary();

    // Abstract method to be overridden in subclasses
    public abstract String getDetails();

    // Getter for the employee name
    public String getName() {
        return name;
    }

    // Getter for employee ID
    public int getEmployeeID() {
        return employeeID;
    }
}

class Manager extends Employee {
    private int numberOfProjects;
    private double bonusPerProject = 1000; // Example value

    public Manager(String name, int employeeID, double baseSalary, int numberOfProjects) {
        super(name, employeeID, baseSalary);
        this.numberOfProjects = numberOfProjects;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        // Calculate salary as base salary + bonus for projects
        this.salary = this.salary + (numberOfProjects * bonusPerProject);
    }

    @Override
    public String getDetails() {
        return String.format("Name: %s\nEmployee ID: %d\nRole: Manager\nTotal Salary: %.2f (Base: %.2f, Bonus for %d projects)",
                name, employeeID, salary, salary - (numberOfProjects * bonusPerProject), numberOfProjects);
    }
}

class Engineer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Engineer(String name, int employeeID, double hourlyRate, int hoursWorked) {
        super(name, employeeID, 0); // Salary will be calculated based on hours worked
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        // Calculate salary as hourly rate * hours worked
        this.salary = hourlyRate * hoursWorked;
    }

    @Override
    public String getDetails() {
        return String.format("Name: %s\nEmployee ID: %d\nRole: Engineer\nTotal Salary: %.2f (Hourly Rate: %.2f, Hours Worked: %d)",
                name, employeeID, salary, hourlyRate, hoursWorked);
    }
}

class Intern extends Employee {
    private double stipend;

    public Intern(String name, int employeeID, double stipend) {
        super(name, employeeID, stipend);
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        // Salary is the stipend itself
        this.salary = stipend;
    }

    @Override
    public String getDetails() {
        return String.format("Name: %s\nEmployee ID: %d\nRole: Intern\nTotal Salary: %.2f (Stipend: %.2f)",
                name, employeeID, salary, stipend);
    }
}



public class caseStudy2{
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the input file name as a command-line argument.");
            return;
        }

        String fileName = args[0];
        try {
            Employee[] employees = readEmployeesFromFile(fileName);
            if (employees == null) return;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter type of employee to filter (Manager/Engineer/Intern): ");
            String type = reader.readLine().trim();
            
            Employee[] filteredEmployees = filterByType(employees, type);
            System.out.println("Details of filtered employees:");
            for (Employee employee : filteredEmployees) {
                if (employee != null) {
                    System.out.println(employee.getDetails());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static Employee[] readEmployeesFromFile(String fileName) {
        List<Employee> employeeList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length < 4) continue;

                String type = parts[0];
                String name = parts[1];
                int employeeID = Integer.parseInt(parts[2]);

                switch (type) {
                    case "Manager":
                        int numberOfProjects = Integer.parseInt(parts[3]);
                        double baseSalary = Double.parseDouble(parts[4]);
                        employeeList.add(new Manager(name, employeeID, baseSalary, numberOfProjects));
                        break;
                    case "Engineer":
                        double hourlyRate = Double.parseDouble(parts[3]);
                        int hoursWorked = Integer.parseInt(parts[4]);
                        employeeList.add(new Engineer(name, employeeID, hourlyRate, hoursWorked));
                        break;
                    case "Intern":
                        double stipend = Double.parseDouble(parts[3]);
                        employeeList.add(new Intern(name, employeeID, stipend));
                        break;
                    default:
                        System.out.println("Unknown employee type: " + type);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return null;
        }
        return employeeList.toArray(new Employee[0]);
    }

    public static Employee[] filterByType(Employee[] employees, String type) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getClass().getSimpleName().equalsIgnoreCase(type)) {
                filteredList.add(employee);
            }
        }
        return filteredList.toArray(new Employee[0]);
    }
}
