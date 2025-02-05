//Q1. Bank Account Management System 
class BankAccount {
    private int accNo;
    private double balance;

    // Constructor 
    public BankAccount(int accNo, double balance) throws IllegalArgumentException {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accNo = accNo;
        this.balance = balance;
    }

    // Method of depositing the amount
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method for withdrawing the amount
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Displaying the account details of the user
    public void show() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        try {
            // Creating a new bank account
            BankAccount account = new BankAccount(1001, 5000);
            account.show();
            
            // Performing transactions with new account
            account.deposit(1500);
            account.show();
            
            account.withdraw(2000);
            account.show();
            
            // Demonstrating exception handling in new account
            account.withdraw(6000); // This should throw an exception
            account.deposit(-500);  // This should throw an exception
            
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
