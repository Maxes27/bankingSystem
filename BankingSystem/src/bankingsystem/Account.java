package bankingsystem;

public class Account {
    private double balance;
    private int accountNumber;

    public Account() {
        balance = 0;
        accountNumber = 0;
    }

    //Getters
    public double getBalance() {
        return balance;
    }

    //Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //toString overriding
    public String toString() {
        return "Balance: " + balance + "\nAccount Number: " + accountNumber;
    }

    public String toString(Account account) {
        return "Balance is: " + account.balance + "\nAccount Number: " + account.accountNumber;
    }

    //Methods
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("You don't have a sufficient amount to withdraw.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

}
