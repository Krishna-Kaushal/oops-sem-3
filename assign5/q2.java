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

public class q2{
    public static void main(String[] args) {
        // Creating an instance of the Address class
        Address student1 = new Address("Alice Brown", "REG123", "John Brown", "123 Maple St", "456 Pine St", "555-1234", "alice.brown@example.com");

        // Displaying the student's details, including address
        System.out.println(student1);

        // Example of accessing individual fields
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student's Email ID: " + student1.getEmailId());
    }
}

