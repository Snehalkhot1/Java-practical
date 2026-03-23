class BankAccount {
    double balance = 500;
    void deposit(double amt) {
        balance = balance + amt;
        System.out.println("Balance = " +balance);
    }
    void withdraw(double amt){
        balance = balance - amt;
        System.out.println("Balance = " +balance);
    }
}
class SavingAccount extends BankAccount {
    void withdraw(double amt) {
        if(balance - amt < 100) {
            System.out.println("Minimum balance 100 requried");
        } else {
            balance = balance - amt;
            System.out.println("Balance = " +balance);
        }
    }
}
public Class Main {
    public static void main(String[] args)
    {
        SavingAccount s = new SavingAccount();
        s.deposit(200);
        s.withdraw(550);
    }
}