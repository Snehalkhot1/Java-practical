// Custom Exception for Low Balance
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Custom Exception for Negative Number
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Balance Enquiry
    public void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    // Deposit Method
    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw Method
    public void withdraw(double amount) 
            throws LowBalanceException, NegativeNumberException {

        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount!");
        }

        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

// Main Class
public class BankDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.balanceEnquiry();
            account.deposit(2000);
            account.withdraw(1000);
            account.withdraw(10000);   // This will throw LowBalanceException
        }
        catch (LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        account.balanceEnquiry();
    }
}