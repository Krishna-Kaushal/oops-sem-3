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
    protected List<String> skills;

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

class HOD extends Faculty {
    private String departmentName;

    public HOD(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber, String departmentName) {
        super(employeeId, name, department, dob, designation, yearOfJoining, phoneNumber);
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "HOD of " + departmentName + "\n" + super.name + " (" + super.designation + ") in the " + super.department + " department.";
    }
}

class DUGC extends Faculty {
    private String ugProgramName;

    public DUGC(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber, String ugProgramName) {
        super(employeeId, name, department, dob, designation, yearOfJoining, phoneNumber);
        this.ugProgramName = ugProgramName;
    }

    @Override
    public String toString() {
        return "DUGC Convenor of " + ugProgramName + " program\n" + super.name + " (" + super.designation + ") in the " + super.department + " department.";
    }
}

class DMPC extends Faculty {
    private String pgProgramName;

    public DMPC(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber, String pgProgramName) {
        super(employeeId, name, department, dob, designation, yearOfJoining, phoneNumber);
        this.pgProgramName = pgProgramName;
    }

    @Override
    public String toString() {
        return "DMPC Convenor of " + pgProgramName + " program\n" + super.name + " (" + super.designation + ") in the " + super.department + " department.";
    }
}

class DDPC extends Faculty {
    private String phdProgramName;

    public DDPC(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber, String phdProgramName) {
        super(employeeId, name, department, dob, designation, yearOfJoining, phoneNumber);
        this.phdProgramName = phdProgramName;
    }

    @Override
    public String toString() {
        return "DDPC Convenor of " + phdProgramName + " program\n" + super.name + " (" + super.designation + ") in the " + super.department + " department.";
    }
}

class SkilledStaff extends OfficeStaff {
    public SkilledStaff(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber) {
        super(employeeId, name, department, dob, designation, yearOfJoining, phoneNumber);
    }

    @Override
    public String toString() {
        return "Skilled Staff: " + super.name + " (" + super.designation + ") in the " + super.department + " department with skills: " + String.join(", ", super.skills);
    }
}

class UnskilledStaff extends OfficeStaff {
    public UnskilledStaff(String employeeId, String name, String department, String dob, String designation, int yearOfJoining, String phoneNumber) {
        super(employeeId, name, department, dob, designation, yearOfJoining, phoneNumber);
    }

    @Override
    public String toString() {
        return "Unskilled Staff: " + super.name + " (" + super.designation + ") in the " + super.department + " department.";
    }
}

public class q6 {
    public static void main(String[] args) {
        // Creating HOD
        HOD hod1 = new HOD("H001", "Dr. John Doe", "Computer Science", "01-01-1960", "Professor", 1995, "1234567890", "Computer Science");

        // Creating DUGC Convenor
        DUGC dugc1 = new DUGC("F003", "Prof. Jane Smith", "Mechanical Engineering", "15-08-1970", "Associate Professor", 2000, "0987654321", "Mechanical Engineering UG");

        // Creating DMPC Convenor
        DMPC dmpc1 = new DMPC("F004", "Prof. Alan Turing", "Mathematics", "23-06-1912", "Professor", 2001, "2223334445", "Mathematics PG");

        // Creating DDPC Convenor
        DDPC ddpc1 = new DDPC("F005", "Prof. Grace Hopper", "Computer Science", "09-12-1906", "Professor", 1999, "3334445556", "Computer Science PhD");

        // Creating Skilled Staff
        SkilledStaff skilledStaff1 = new SkilledStaff("S004", "Alice Johnson", "Administration", "22-11-1985", "Clerk", 2010, "5555555555");
        skilledStaff1.addSkill("Typing");
        skilledStaff1.addSkill("Record Keeping");

        // Creating Unskilled Staff
        UnskilledStaff unskilledStaff1 = new UnskilledStaff("S005", "Bob Brown", "Maintenance", "30-06-1982", "Assistant", 2008, "4444444444");

        // Printing details of all employees
        System.out.println(hod1);
        System.out.println();
        System.out.println(dugc1);
        System.out.println();
        System.out.println(dmpc1);
        System.out.println();
        System.out.println(ddpc1);
        System.out.println();
        System.out.println(skilledStaff1);
        System.out.println();
        System.out.println(unskilledStaff1);
    }
}
