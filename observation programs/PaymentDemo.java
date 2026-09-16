interface PaymentService {
    void pay(double amount, String upiId)
            throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException;

    void checkBalance();
}

// Custom exception for invalid UPI ID
class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}

// Custom exception for invalid amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Wallet class
class Wallet {
    private String userName;
    private String mobileNumber;
    private double balance;

    // Constructor
    public Wallet(String userName, String mobileNumber, double balance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    // Add money to wallet
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " added to wallet.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    // Deduct money from wallet
    public void deductMoney(double amount) {
        balance -= amount;
    }
}

// UPIPayment implements PaymentService
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Associate Wallet object with UPIPayment
    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(double amount, String upiId)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID using String operations
        if (upiId == null || upiId.isEmpty()
                || !upiId.contains("@")
                || upiId.startsWith("@")
                || upiId.endsWith("@")) {

            throw new InvalidUPIException("Invalid UPI ID: " + upiId);
        }

        // Validate payment amount
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid payment amount. Amount must be greater than zero.");
        }

        // Check sufficient balance
        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance: ₹"
                    + wallet.getBalance());
        }

        // Deduct amount
        wallet.deductMoney(amount);

        // Payment successful
        System.out.println("Payment of ₹" + amount
                + " successful to UPI ID: " + upiId);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Wallet Balance: ₹" + wallet.getBalance());
    }
}

// Main class
public class PaymentDemo {

    public static void main(String[] args) {

        // Create Wallet object
        Wallet wallet = new Wallet(
                "Rahul",
                "9876543210",
                5000.00
        );

        // Add money to wallet
        wallet.addMoney(1000.00);

        // Create UPIPayment object and associate Wallet
        UPIPayment payment = new UPIPayment(wallet);

        String upiId = "rahul@upi";
        double amount = 2500.00;

        try {
            System.out.println("\n--- Transaction Started ---");

            payment.pay(amount, upiId);

        } catch (InvalidUPIException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } catch (InvalidAmountException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {
            System.out.println("--- Transaction Completed ---");
            payment.checkBalance();
        }
    }
}
