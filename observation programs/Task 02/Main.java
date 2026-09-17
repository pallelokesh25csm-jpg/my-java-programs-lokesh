class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    // Constructor
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Transfer money to another account
    public void transfer(Account receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            receiver.balance += amount;
            System.out.println("Transferred: " + amount +
                               " to account " + receiver.accountNumber);
        } else {
            System.out.println("Transfer failed. Insufficient balance.");
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}


// SavingsAccount inherits from Account
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest based on balance
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}


// CurrentAccount inherits from Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw() to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}


// Main class
public class Main {
    public static void main(String[] args) {

        // Create SavingsAccount object
        SavingsAccount savings = new SavingsAccount(
                "SA1001", "Alice", 10000, 5.0);

        // Create CurrentAccount object
        CurrentAccount current = new CurrentAccount(
                "CA1001", "Bob", 5000, 3000);

        // Display details before transactions
        System.out.println("===== BEFORE TRANSACTIONS =====");

        System.out.println("\nSavings Account:");
        savings.displayDetails();

        System.out.println("\nCurrent Account:");
        current.displayDetails();


        // Savings account transactions
        System.out.println("\n===== SAVINGS ACCOUNT TRANSACTIONS =====");

        savings.deposit(2000);
        savings.withdraw(1500);

        double interest = savings.calculateInterest();
        System.out.println("Calculated Interest: " + interest);

        // Add calculated interest to savings balance
        savings.deposit(interest);


        // Current account transactions
        System.out.println("\n===== CURRENT ACCOUNT TRANSACTIONS =====");

        current.deposit(1000);

        // Normal withdrawal
        current.withdraw(4000);

        // Withdrawal using overdraft
        current.withdraw(4000);


        // Transfer money from savings to current
        System.out.println("\n===== FUND TRANSFER =====");

        savings.transfer(current, 2000);


        // Display details after transactions
        System.out.println("\n===== AFTER TRANSACTIONS =====");

        System.out.println("\nSavings Account:");
        savings.displayDetails();

        System.out.println("\nCurrent Account:");
        current.displayDetails();


        // Final balances
        System.out.println("\n===== FINAL BALANCES =====");
        System.out.println("Savings Account Balance : " + savings.balance);
        System.out.println("Current Account Balance : " + current.balance);
    }
}
