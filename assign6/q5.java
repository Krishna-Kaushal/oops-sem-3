import java.util.List;
import java.util.ArrayList;

class Employee {
    // Protected attributes
    protected String employeeId;
    protected String name;
    protected String department;
    protected String dob;
    protected String designation;
    protected int yearOfJoining;
    protected String phoneNumber;

    // Constructor
    public Employee(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.dob = dob;
        this.designation = designation;
        this.yearOfJoining = yearOfJoining;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Function to print details of the employee
    public void printDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Designation: " + designation);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class Faculty extends Employee {
    private List<String> subjects;
    private List<String> labs;

    // Constructor
    public Faculty(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber) {
        super(employeeId, name, department, dob, designation, yearOfJoining, phoneNumber);
        this.subjects = new ArrayList<>();
        this.labs = new ArrayList<>();
    }

    // Function to add a subject
    public void addSubject(String subject) {
        subjects.add(subject);
    }

    // Function to add a lab
    public void addLab(String lab) {
        labs.add(lab);
    }

    // Function to print list of subjects and labs
    public void printTeachingDetails() {
        System.out.println("Subjects Taught: " + String.join(", ", subjects));
        System.out.println("Labs Taught: " + String.join(", ", labs));
    }

    @Override
    public void printDetails() {
        super.printDetails();
        printTeachingDetails();
    }
}

class OfficeStaff extends Employee {
    private List<String> skills;

    // Constructor
    public OfficeStaff(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber) {
        super(employeeId, name, department, dob, designation, yearOfJoining, phoneNumber);
        this.skills = new ArrayList<>();
    }

    // Function to add a skill
    public void addSkill(String skill) {
        skills.add(skill);
    }

    // Function to print list of skills
    public void printSkills() {
        System.out.println("Skills: " + String.join(", ", skills));
    }

    @Override
    public void printDetails() {
        super.printDetails();
        printSkills();
    }
}

public class q5 {
    public static void main(String[] args) {
        // Creating Faculty members
        Faculty faculty1 = new Faculty("F001", "John Doe", "Computer Science", "01-01-1980", "Professor", 2005, "1234567890");
        faculty1.addSubject("Data Structures");
        faculty1.addSubject("Algorithms");
        faculty1.addLab("Data Structures Lab");

        Faculty faculty2 = new Faculty("F002", "Jane Smith", "Physics", "15-08-1975", "Associate Professor", 2000, "0987654321");
        faculty2.addSubject("Quantum Mechanics");
        faculty2.addLab("Advanced Physics Lab");

        // Creating Office Staff members
        OfficeStaff staff1 = new OfficeStaff("S001", "Alice Johnson", "Administration", "22-11-1985", "Clerk", 2010, "5555555555");
        staff1.addSkill("Typing");
        staff1.addSkill("Record Keeping");

        OfficeStaff staff2 = new OfficeStaff("S002", "Bob Brown", "Technical Support", "30-06-1982", "Technician", 2008, "4444444444");
        staff2.addSkill("Hardware Troubleshooting");
        staff2.addSkill("Network Setup");

        OfficeStaff staff3 = new OfficeStaff("S003", "Charlie Davis", "Human Resources", "10-10-1990", "HR Assistant", 2015, "3333333333");
        staff3.addSkill("Employee Relations");
        staff3.addSkill("Recruitment");

        // Printing details of all employees
        faculty1.printDetails();
        System.out.println();
        faculty2.printDetails();
        System.out.println();
        staff1.printDetails();
        System.out.println();
        staff2.printDetails();
        System.out.println();
        staff3.printDetails();
    }
}
