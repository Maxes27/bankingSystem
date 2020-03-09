package bankingsystem;

public class SpecialAccount extends Account {

    //Methods
    public void withdraw(double amount) {
        double balance = getBalance();
        if (balance - amount >= -1000) {
            setBalance(balance -= amount);
        } else {
            System.out.println("You have exceeded the -1000 limit");
        }
    }
}
