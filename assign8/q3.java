import java.io.*;
import java.util.*;

class Student {
    // Student details
    protected String name;
    protected String regNumber;
    protected String fathersName;

    // Constructor
    public Student(String name, String regNumber, String fathersName) {
        this.name = name;
        this.regNumber = regNumber;
        this.fathersName = fathersName;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Father's Name: " + fathersName);
    }

    // Method to format student details as a string (for file writing)
    public String studentDetailsAsString() {
        return "Name: " + name + "\n" + 
               "Registration Number: " + regNumber + "\n" +
               "Father's Name: " + fathersName + "\n";
    }
}

class Address extends Student {
    // Address and contact details
    private String currentAddress;
    private String permanentAddress;
    private String contactNumber;
    private String emailId;

    // Constructor
    public Address(String name, String regNumber, String fathersName, String currentAddress, String permanentAddress, String contactNumber, String emailId) {
        super(name, regNumber, fathersName); // Call the parent class constructor
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }

    // Method to display complete details (student + address)
    public void displayDetails() {
        super.displayStudentDetails();
        System.out.println("Current Address: " + currentAddress);
        System.out.println("Permanent Address: " + permanentAddress);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email ID: " + emailId);
    }

    // Method to format complete details as a string (for file writing)
    public String completeDetailsAsString() {
        return super.studentDetailsAsString() + 
               "Current Address: " + currentAddress + "\n" +
               "Permanent Address: " + permanentAddress + "\n" +
               "Contact Number: " + contactNumber + "\n" +
               "Email ID: " + emailId + "\n";
    }
}

public class q3 {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for student and address details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter registration number: ");
        String regNumber = scanner.nextLine();
        
        System.out.print("Enter father's name: ");
        String fathersName = scanner.nextLine();
        
        System.out.print("Enter current address: ");
        String currentAddress = scanner.nextLine();
        
        System.out.print("Enter permanent address: ");
        String permanentAddress = scanner.nextLine();
        
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();
        
        System.out.print("Enter email ID: ");
        String emailId = scanner.nextLine();

        // Create an Address object (child class of Student)
        Address studentAddress = new Address(name, regNumber, fathersName, currentAddress, permanentAddress, contactNumber, emailId);

        // Store student details into a file
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true); // Appending mode
            writer.write(studentAddress.completeDetailsAsString() + "\n");
            writer.close();
            System.out.println("Student details saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error: Could not write to the file.");
        }

        // Search for a student's details by registration number
        System.out.print("\nEnter registration number to search for: ");
        String searchRegNumber = scanner.nextLine();
        
        searchStudentByRegNumber(searchRegNumber);
    }

    // Method to search for a student by registration number
    public static void searchStudentByRegNumber(String regNumber) {
        try {
            File inputFile = new File(FILE_NAME);
            Scanner fileScanner = new Scanner(inputFile);
            boolean found = false;
            StringBuilder studentDetails = new StringBuilder();
            String line;
            
            // Read through the file to find matching student details
            while (fileScanner.hasNextLine()) {
                line = fileScanner.nextLine();
                if (line.contains("Registration Number: " + regNumber)) {
                    found = true;
                    studentDetails.append(line).append("\n");
                    // Capture the next few lines related to the student's details
                    for (int i = 0; i < 6; i++) {
                        studentDetails.append(fileScanner.nextLine()).append("\n");
                    }
                    break;
                }
            }
            fileScanner.close();
            
            // Display search results
            if (found) {
                System.out.println("\nStudent details found:");
                System.out.println(studentDetails);
            } else {
                System.out.println("\nStudent with Registration Number " + regNumber + " not found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
