// Abstract base class Student
abstract class Student {
    protected String name;
    protected String regNumber;
    protected String fatherName;
    protected String currentAddress;
    protected String permanentAddress;
    protected String phoneNumber;
    protected String emailId;

    // Constructor
    public Student(String name, String regNumber, String fatherName, String currentAddress, 
                   String permanentAddress, String phoneNumber, String emailId) {
        this.name = name;
        this.regNumber = regNumber;
        this.fatherName = fatherName;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void displayDetails();

    // Getter and Setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

// UGStudent class extending Student
class UGStudent extends Student {
    protected String qualifyingDegree;
    protected double qualifyingMarks;

    public UGStudent(String name, String regNumber, String fatherName, String currentAddress,
                     String permanentAddress, String phoneNumber, String emailId, 
                     String qualifyingDegree, double qualifyingMarks) {
        super(name, regNumber, fatherName, currentAddress, permanentAddress, phoneNumber, emailId);
        this.qualifyingDegree = qualifyingDegree;
        this.qualifyingMarks = qualifyingMarks;
    }

    // Getter and Setter methods for UGStudent attributes
    public String getQualifyingDegree() {
        return qualifyingDegree;
    }

    public void setQualifyingDegree(String qualifyingDegree) {
        this.qualifyingDegree = qualifyingDegree;
    }

    public double getQualifyingMarks() {
        return qualifyingMarks;
    }

    public void setQualifyingMarks(double qualifyingMarks) {
        this.qualifyingMarks = qualifyingMarks;
    }

    @Override
    public void displayDetails() {
        System.out.println("UG Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Current Address: " + currentAddress);
        System.out.println("Permanent Address: " + permanentAddress);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email ID: " + emailId);
        System.out.println("Qualifying Degree: " + qualifyingDegree);
        System.out.println("Qualifying Marks: " + qualifyingMarks);
    }
}

// PGStudent class extending Student
class PGStudent extends Student {
    protected String qualifyingDegree;
    protected double qualifyingMarks;

    public PGStudent(String name, String regNumber, String fatherName, String currentAddress,
                     String permanentAddress, String phoneNumber, String emailId, 
                     String qualifyingDegree, double qualifyingMarks) {
        super(name, regNumber, fatherName, currentAddress, permanentAddress, phoneNumber, emailId);
        this.qualifyingDegree = qualifyingDegree;
        this.qualifyingMarks = qualifyingMarks;
    }

    // Getter and Setter methods for PGStudent attributes
    public String getQualifyingDegree() {
        return qualifyingDegree;
    }

    public void setQualifyingDegree(String qualifyingDegree) {
        this.qualifyingDegree = qualifyingDegree;
    }

    public double getQualifyingMarks() {
        return qualifyingMarks;
    }

    public void setQualifyingMarks(double qualifyingMarks) {
        this.qualifyingMarks = qualifyingMarks;
    }

    @Override
    public void displayDetails() {
        System.out.println("PG Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Current Address: " + currentAddress);
        System.out.println("Permanent Address: " + permanentAddress);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email ID: " + emailId);
        System.out.println("Qualifying Degree: " + qualifyingDegree);
        System.out.println("Qualifying Marks: " + qualifyingMarks);
    }
}

// PhDStudent class extending Student
class PhDStudent extends Student {
    protected String qualifyingDegree;
    protected double qualifyingMarks;

    public PhDStudent(String name, String regNumber, String fatherName, String currentAddress,
                      String permanentAddress, String phoneNumber, String emailId, 
                      String qualifyingDegree, double qualifyingMarks) {
        super(name, regNumber, fatherName, currentAddress, permanentAddress, phoneNumber, emailId);
        this.qualifyingDegree = qualifyingDegree;
        this.qualifyingMarks = qualifyingMarks;
    }

    // Getter and Setter methods for PhDStudent attributes
    public String getQualifyingDegree() {
        return qualifyingDegree;
    }

    public void setQualifyingDegree(String qualifyingDegree) {
        this.qualifyingDegree = qualifyingDegree;
    }

    public double getQualifyingMarks() {
        return qualifyingMarks;
    }

    public void setQualifyingMarks(double qualifyingMarks) {
        this.qualifyingMarks = qualifyingMarks;
    }

    @Override
    public void displayDetails() {
        System.out.println("PhD Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Current Address: " + currentAddress);
        System.out.println("Permanent Address: " + permanentAddress);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email ID: " + emailId);
        System.out.println("Qualifying Degree: " + qualifyingDegree);
        System.out.println("Qualifying Marks: " + qualifyingMarks);
    }
}

// Main class to test the program
public class q1 {
    public static void main(String[] args) {
        UGStudent ugStudent = new UGStudent("Alice", "UG123", "Bob", "123 Street A", "456 Avenue B", 
                                            "1234567890", "alice@example.com", "High School Diploma", 85.5);
        PGStudent pgStudent = new PGStudent("Charlie", "PG456", "David", "789 Street C", "012 Avenue D", 
                                            "0987654321", "charlie@example.com", "Bachelor's Degree", 75.0);
        PhDStudent phdStudent = new PhDStudent("Eve", "PhD789", "Frank", "345 Street E", "678 Avenue F", 
                                               "1112223333", "eve@example.com", "Master's Degree", 88.0);

        ugStudent.displayDetails();
        System.out.println();
        pgStudent.displayDetails();
        System.out.println();
        phdStudent.displayDetails();
    }
}
