class Payment {
    // Protected attribute
    protected String paymentId;

    // Constructor
    public Payment(String paymentId) {
        this.paymentId = paymentId;
    }

    // Getter and Setter
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}

class PaymentDD extends Payment {
    protected String bankName;
    protected String ddNumber;
    protected double amount;

    // Constructor
    public PaymentDD(String paymentId, String bankName, String ddNumber, double amount) {
        super(paymentId);
        this.bankName = bankName;
        this.ddNumber = ddNumber;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class PaymentUPI extends Payment {
    protected String upiId;
    protected double amount;

    // Constructor
    public PaymentUPI(String paymentId, String upiId, double amount) {
        super(paymentId);
        this.upiId = upiId;
        this.amount = amount;
    }

    // Getters and Setters
    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class PaymentNB extends Payment {
    protected String bankName;
    protected String transactionId;
    protected double amount;

    // Constructor
    public PaymentNB(String paymentId, String bankName, String transactionId, double amount) {
        super(paymentId);
        this.bankName = bankName;
        this.transactionId = transactionId;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public class q3 {
    public static void main(String[] args) {
        // Payment using Demand Draft
        PaymentDD paymentDD = new PaymentDD("PAY001", "Bank of America", "DD123456", 1500.00);
        System.out.println("Payment ID: " + paymentDD.getPaymentId());
        System.out.println("Bank Name: " + paymentDD.getBankName());
        System.out.println("DD Number: " + paymentDD.getDdNumber());
        System.out.println("Amount: " + paymentDD.getAmount());

        // Payment using UPI
        PaymentUPI paymentUPI = new PaymentUPI("PAY002", "user@upi", 500.00);
        System.out.println("\nPayment ID: " + paymentUPI.getPaymentId());
        System.out.println("UPI ID: " + paymentUPI.getUpiId());
        System.out.println("Amount: " + paymentUPI.getAmount());

        // Payment using Net Banking
        PaymentNB paymentNB = new PaymentNB("PAY003", "Wells Fargo", "TXN789012", 2000.00);
        System.out.println("\nPayment ID: " + paymentNB.getPaymentId());
        System.out.println("Bank Name: " + paymentNB.getBankName());
        System.out.println("Transaction ID: " + paymentNB.getTransactionId());
        System.out.println("Amount: " + paymentNB.getAmount());
    }
}
