class Student {
    // Protected attributes
    protected String name;
    protected String regNo;
    protected String fatherName;
    protected String currentAddress;
    protected String permanentAddress;
    protected String phoneNumber;
    protected String emailId;
    protected Course course;
    protected Payment payment;

    // Constructor
    public Student(String name, String regNo, String fatherName, String currentAddress, String permanentAddress, String phoneNumber, String emailId, Course course, Payment payment) {
        this.name = name;
        this.regNo = regNo;
        this.fatherName = fatherName;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.course = course;
        this.payment = payment;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // Member function to print course and payment details
    public void printDetails() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Course Code: " + course.getCode());
        System.out.println("Course Name: " + course.getName());
        System.out.println("Course Credit: " + course.getCredit());
        System.out.println("Payment ID: " + payment.getPaymentId());
        if (payment instanceof PaymentDD) {
            PaymentDD dd = (PaymentDD) payment;
            System.out.println("Payment Mode: Demand Draft");
            System.out.println("Bank Name: " + dd.getBankName());
            System.out.println("DD Number: " + dd.getDdNumber());
        } else if (payment instanceof PaymentUPI) {
            PaymentUPI upi = (PaymentUPI) payment;
            System.out.println("Payment Mode: UPI");
            System.out.println("UPI ID: " + upi.getUpiId());
        } else if (payment instanceof PaymentNB) {
            PaymentNB nb = (PaymentNB) payment;
            System.out.println("Payment Mode: Net Banking");
            System.out.println("Bank Name: " + nb.getBankName());
            System.out.println("Transaction ID: " + nb.getTransactionId());
        }
        System.out.println("Amount: " + payment.getAmount());
        System.out.println();
    }
}

class Course {
    // Protected attributes
    protected String code;
    protected String name;
    protected int credit;

    // Constructor
    public Course(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}

class UGCourse extends Course {
    // Constructor
    public UGCourse(String code, String name, int credit) {
        super("UG-" + code, name, credit);
    }
}

class PGCourse extends Course {
    // Constructor
    public PGCourse(String code, String name, int credit) {
        super("PG-" + code, name, credit);
    }
}

class Payment {
    // Protected attributes
    protected String paymentId;
    protected double amount;

    // Constructor
    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    // Getter and Setter for paymentId
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    // Getter and Setter for amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class PaymentDD extends Payment {
    protected String bankName;
    protected String ddNumber;

    // Constructor
    public PaymentDD(String paymentId, String bankName, String ddNumber, double amount) {
        super(paymentId, amount);
        this.bankName = bankName;
        this.ddNumber = ddNumber;
    }

    // Getters and Setters
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDdNumber() {
        return ddNumber;
    }

    public void setDdNumber(String ddNumber) {
        this.ddNumber = ddNumber;
    }
}

class PaymentUPI extends Payment {
    protected String upiId;

    // Constructor
    public PaymentUPI(String paymentId, String upiId, double amount) {
        super(paymentId, amount);
        this.upiId = upiId;
    }

    // Getter and Setter for upiId
    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}

class PaymentNB extends Payment {
    protected String bankName;
    protected String transactionId;

    // Constructor
    public PaymentNB(String paymentId, String bankName, String transactionId, double amount) {
        super(paymentId, amount);
        this.bankName = bankName;
        this.transactionId = transactionId;
    }

    // Getters and Setters
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
}

public class q4 {
    public static void main(String[] args) {
        // Creating courses
        UGCourse ugCourse1 = new UGCourse("1001", "Introduction to Computer Science", 4);
        PGCourse pgCourse1 = new PGCourse("2001", "Advanced Algorithms", 3);

        // Creating payments
        PaymentDD paymentDD1 = new PaymentDD("PAY001", "Bank of America", "DD123456", 1500.00);
        PaymentUPI paymentUPI1 = new PaymentUPI("PAY002", "user@upi", 500.00);
        PaymentNB paymentNB1 = new PaymentNB("PAY003", "Wells Fargo", "TXN789012", 2000.00);

        // Creating students
        Student student1 = new Student("John Doe", "UG123", "Mr. Doe", "123 Current St", "456 Permanent St", "1234567890", "john@example.com", ugCourse1, paymentDD1);
        Student student2 = new Student("Jane Doe", "PG456", "Mr. Doe", "123 Current St", "456 Permanent St", "0987654321", "jane@example.com", pgCourse1, paymentUPI1);
        Student student3 = new Student("Jim Beam", "UG789", "Mr. Beam", "789 Current St", "101 Permanent St", "5555555555", "jim@example.com", ugCourse1, paymentNB1);
        
        // Creating more students (dummy data)
        Student student4 = new Student("Alice Smith", "UG124", "Mr. Smith", "124 Current St", "457 Permanent St", "1112223334", "alice@example.com", ugCourse1, paymentDD1);
        Student student5 = new Student("Bob Johnson", "PG457", "Mr. Johnson", "125 Current St", "458 Permanent St", "2223334445", "bob@example.com", pgCourse1, paymentUPI1);
        Student student6 = new Student("Charlie Brown", "UG790", "Mr. Brown", "126 Current St", "459 Permanent St", "3334445556", "charlie@example.com", ugCourse1, paymentNB1);
        Student student7 = new Student("Daisy Miller", "UG125", "Mr. Miller", "127 Current St", "460 Permanent St", "4445556667", "daisy@example.com", ugCourse1, paymentDD1);
        Student student8 = new Student("Eve Davis", "PG458", "Mr. Davis", "128 Current St", "461 Permanent St", "5556667778", "eve@example.com", pgCourse1, paymentUPI1);
        Student student9 = new Student("Frank White", "UG791", "Mr. White", "129 Current St", "462 Permanent St", "6667778889", "frank@example.com", ugCourse1, paymentNB1);
        Student student10 = new Student("Grace Black", "UG126", "Mr. Black", "130 Current St", "463 Permanent St", "7778889990", "grace@example.com", ugCourse1, paymentDD1);

        // Printing details of students
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
        student4.printDetails();
        student5.printDetails();
        student6.printDetails();
        student7.printDetails();
        student8.printDetails();
        student9.printDetails();
        student10.printDetails();
    }
}
