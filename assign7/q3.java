import java.util.ArrayList;
import java.util.List;

// Abstract base class Employee
abstract class Employee {
    protected int employeeID;
    protected String name;
    protected String department;
    protected String dob;
    protected String designation;
    protected int yearOfJoining;
    protected String phoneNumber;

    // Constructor
    public Employee(int employeeID, String name, String department, String dob, 
                    String designation, int yearOfJoining, String phoneNumber) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.dob = dob;
        this.designation = designation;
        this.yearOfJoining = yearOfJoining;
        this.phoneNumber = phoneNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void printDetails();

    // Getter method for employeeID
    public int getEmployeeID() {
        return employeeID;
    }
}

// Faculty class extending Employee
class Faculty extends Employee {
    private List<String> subjectsTaught;
    private List<String> labsHandled;

    // Constructor
    public Faculty(int employeeID, String name, String department, String dob, 
                   String designation, int yearOfJoining, String phoneNumber) {
        super(employeeID, name, department, dob, designation, yearOfJoining, phoneNumber);
        subjectsTaught = new ArrayList<>();
        labsHandled = new ArrayList<>();
    }

    // Method to add a subject
    public void addSubject(String subject) {
        subjectsTaught.add(subject);
    }

    // Method to add a lab
    public void addLab(String lab) {
        labsHandled.add(lab);
    }

    // Implementing abstract method to print details
    @Override
    public void printDetails() {
        System.out.println("Faculty Details:");
        System.out.println("ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("DOB: " + dob);
        System.out.println("Designation: " + designation);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Subjects Taught: " + subjectsTaught);
        System.out.println("Labs Handled: " + labsHandled);
    }
}

// OfficeStaff class extending Employee
class OfficeStaff extends Employee {
    private List<String> skills;

    // Constructor
    public OfficeStaff(int employeeID, String name, String department, String dob, 
                       String designation, int yearOfJoining, String phoneNumber) {
        super(employeeID, name, department, dob, designation, yearOfJoining, phoneNumber);
        skills = new ArrayList<>();
    }

    // Method to add a skill
    public void addSkill(String skill) {
        skills.add(skill);
    }

    // Implementing abstract method to print details
    @Override
    public void printDetails() {
        System.out.println("Office Staff Details:");
        System.out.println("ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("DOB: " + dob);
        System.out.println("Designation: " + designation);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Skills: " + skills);
    }
}

// Test class to demonstrate the functionality
public class q3 {
    public static void main(String[] args) {
        // Create instances of Faculty and OfficeStaff
        Faculty faculty1 = new Faculty(101, "Alice", "Computer Science", "1985-03-15", 
                                        "Professor", 2005, "1234567890");
        faculty1.addSubject("Data Structures");
        faculty1.addSubject("Algorithms");
        faculty1.addLab("Data Structures Lab");

        Faculty faculty2 = new Faculty(102, "Bob", "Physics", "1978-11-25", 
                                        "Assistant Professor", 2010, "2345678901");
        faculty2.addSubject("Quantum Mechanics");
        faculty2.addLab("Quantum Lab");

        OfficeStaff staff1 = new OfficeStaff(201, "Charlie", "Administration", "1982-06-10", 
                                              "Clerk", 2015, "3456789012");
        staff1.addSkill("Typing");
        staff1.addSkill("Document Management");

        OfficeStaff staff2 = new OfficeStaff(202, "Dave", "IT Support", "1990-08-20", 
                                              "Technician", 2017, "4567890123");
        staff2.addSkill("Network Troubleshooting");
        staff2.addSkill("Hardware Repair");

        OfficeStaff staff3 = new OfficeStaff(203, "Eve", "Finance", "1986-09-05", 
                                              "Accountant", 2012, "5678901234");
        staff3.addSkill("Accounting");
        staff3.addSkill("Excel Proficiency");

        // Demonstrating the functionality
        Employee[] employees = {faculty1, faculty2, staff1, staff2, staff3};
        for (Employee employee : employees) {
            employee.printDetails();
            System.out.println();
        }
    }
}
