import java.util.Date;
class Student {
    private String name;
    private String registrationNumber;
    private String fatherName;

    public Student(String name, String registrationNumber, String fatherName) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.fatherName = fatherName;
    }

    // Getters and setters for each field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Registration Number: " + registrationNumber + ", Father's Name: " + fatherName;
    }
}

class Address extends Student {
    private String currentAddress;
    private String permanentAddress;
    private String contactNumber;
    private String emailId;

    public Address(String name, String registrationNumber, String fatherName, String currentAddress, String permanentAddress, String contactNumber, String emailId) {
        super(name, registrationNumber, fatherName);
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }

    // Getters and setters for each field
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Current Address: " + currentAddress + ", Permanent Address: " + permanentAddress +
                ", Contact Number: " + contactNumber + ", Email ID: " + emailId;
    }
}

class CoursesRegistered extends Address {
    private String courseName;
    private int credits;
    private String courseNumber;
    private String associatedTeachers;

    public CoursesRegistered(String name, String registrationNumber, String fatherName, String currentAddress, String permanentAddress, String contactNumber, String emailId,
                             String courseName, int credits, String courseNumber, String associatedTeachers) {
        super(name, registrationNumber, fatherName, currentAddress, permanentAddress, contactNumber, emailId);
        this.courseName = courseName;
        this.credits = credits;
        this.courseNumber = courseNumber;
        this.associatedTeachers = associatedTeachers;
    }

    // Getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getAssociatedTeachers() {
        return associatedTeachers;
    }

    public void setAssociatedTeachers(String associatedTeachers) {
        this.associatedTeachers = associatedTeachers;
    }

    @Override
    public String toString() {
        return super.toString() + ", Course Name: " + courseName + ", Credits: " + credits +
                ", Course Number: " + courseNumber + ", Associated Teachers: " + associatedTeachers;
    }
}

class AcademicRecords extends CoursesRegistered {
    private String degreeName;
    private int yearOfPassing;
    private String universityBoard;
    private double percentageMarks;

    public AcademicRecords(String name, String registrationNumber, String fatherName, String currentAddress, String permanentAddress, String contactNumber, String emailId,
                           String courseName, int credits, String courseNumber, String associatedTeachers,
                           String degreeName, int yearOfPassing, String universityBoard, double percentageMarks) {
        super(name, registrationNumber, fatherName, currentAddress, permanentAddress, contactNumber, emailId, courseName, credits, courseNumber, associatedTeachers);
        this.degreeName = degreeName;
        this.yearOfPassing = yearOfPassing;
        this.universityBoard = universityBoard;
        this.percentageMarks = percentageMarks;
    }

    // Getters and setters
    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public String getUniversityBoard() {
        return universityBoard;
    }

    public void setUniversityBoard(String universityBoard) {
        this.universityBoard = universityBoard;
    }

    public double getPercentageMarks() {
        return percentageMarks;
    }

    public void setPercentageMarks(double percentageMarks) {
        this.percentageMarks = percentageMarks;
    }

    @Override
    public String toString() {
        return super.toString() + ", Degree Name: " + degreeName + ", Year of Passing: " + yearOfPassing +
                ", University/Board: " + universityBoard + ", Percentage Marks: " + percentageMarks;
    }
}

class PaymentDetails extends AcademicRecords {
    private String bankName;
    private String transactionId;
    private double amount;
    private Date date;

    public PaymentDetails(String name, String registrationNumber, String fatherName, String currentAddress, String permanentAddress, String contactNumber, String emailId,
                          String courseName, int credits, String courseNumber, String associatedTeachers,
                          String degreeName, int yearOfPassing, String universityBoard, double percentageMarks,
                          String bankName, String transactionId, double amount, Date date) {
        super(name, registrationNumber, fatherName, currentAddress, permanentAddress, contactNumber, emailId, courseName, credits, courseNumber, associatedTeachers, degreeName, yearOfPassing, universityBoard, percentageMarks);
        this.bankName = bankName;
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
    }

    // Getters and setters
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bank Name: " + bankName + ", Transaction ID: " + transactionId +
                ", Amount: " + amount + ", Date: " + date;
    }
}



public class q3{
    public static void main(String[] args) {
        // Creating an instance of PaymentDetails class with all the information
        PaymentDetails student1 = new PaymentDetails(
                "Alice Brown", "REG123", "John Brown", "123 Maple St", "456 Pine St", "555-1234", "alice.brown@example.com",
                "Computer Science", 3, "CS101", "Prof. Smith",
                "Bachelor of Science", 2024, "XYZ University", 85.6,
                "ABC Bank", "TXN12345", 1000.0, new Date()
        );

        // Displaying the student's complete details
        System.out.println(student1);
    }
}
