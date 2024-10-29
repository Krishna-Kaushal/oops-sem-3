class Student {
    // Protected attributes
    protected String name;
    protected String regNo;
    protected String fatherName;
    protected String currentAddress;
    protected String permanentAddress;
    protected String phoneNumber;
    protected String emailId;

    // Constructor
    public Student(String name, String regNo, String fatherName, String currentAddress, String permanentAddress, String phoneNumber, String emailId) {
        this.name = name;
        this.regNo = regNo;
        this.fatherName = fatherName;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
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

class UGStudent extends Student {
    protected String qualifyingDegree;
    protected double marks;

    // Constructor
    public UGStudent(String name, String regNo, String fatherName, String currentAddress, String permanentAddress, String phoneNumber, String emailId, String qualifyingDegree, double marks) {
        super(name, regNo, fatherName, currentAddress, permanentAddress, phoneNumber, emailId);
        this.qualifyingDegree = qualifyingDegree;
        this.marks = marks;
    }

    // Getters and Setters
    public String getQualifyingDegree() {
        return qualifyingDegree;
    }

    public void setQualifyingDegree(String qualifyingDegree) {
        this.qualifyingDegree = qualifyingDegree;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

class PGStudent extends Student {
    protected String qualifyingDegree;
    protected double marks;

    // Constructor
    public PGStudent(String name, String regNo, String fatherName, String currentAddress, String permanentAddress, String phoneNumber, String emailId, String qualifyingDegree, double marks) {
        super(name, regNo, fatherName, currentAddress, permanentAddress, phoneNumber, emailId);
        this.qualifyingDegree = qualifyingDegree;
        this.marks = marks;
    }

    // Getters and Setters
    public String getQualifyingDegree() {
        return qualifyingDegree;
    }

    public void setQualifyingDegree(String qualifyingDegree) {
        this.qualifyingDegree = qualifyingDegree;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

class PhDStudent extends Student {
    protected String qualifyingDegree;
    protected double marks;

    // Constructor
    public PhDStudent(String name, String regNo, String fatherName, String currentAddress, String permanentAddress, String phoneNumber, String emailId, String qualifyingDegree, double marks) {
        super(name, regNo, fatherName, currentAddress, permanentAddress, phoneNumber, emailId);
        this.qualifyingDegree = qualifyingDegree;
        this.marks = marks;
    }

    // Getters and Setters
    public String getQualifyingDegree() {
        return qualifyingDegree;
    }

    public void setQualifyingDegree(String qualifyingDegree) {
        this.qualifyingDegree = qualifyingDegree;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class q1 {
    public static void main(String[] args) {
        // Creating UG Student
        UGStudent ugStudent = new UGStudent("John Doe", "UG123", "Mr. Doe", "123 Current St", "456 Permanent St", "1234567890", "john@example.com", "High School", 85.5);

        // Display UG Student details
        System.out.println("UG Student Name: " + ugStudent.getName());
        System.out.println("UG Student Marks: " + ugStudent.getMarks());

        // Creating PG Student
        PGStudent pgStudent = new PGStudent("Jane Doe", "PG456", "Mr. Doe", "123 Current St", "456 Permanent St", "0987654321", "jane@example.com", "Bachelor's Degree", 90.0);

        // Display PG Student details
        System.out.println("PG Student Name: " + pgStudent.getName());
        System.out.println("PG Student Marks: " + pgStudent.getMarks());

        // Creating PhD Student
        PhDStudent phdStudent = new PhDStudent("Jim Beam", "PhD789", "Mr. Beam", "789 Current St", "101 Permanent St", "5555555555", "jim@example.com", "Master's Degree", 95.0);

        // Display PhD Student details
        System.out.println("PhD Student Name: " + phdStudent.getName());
        System.out.println("PhD Student Marks: " + phdStudent.getMarks());
    }
}
