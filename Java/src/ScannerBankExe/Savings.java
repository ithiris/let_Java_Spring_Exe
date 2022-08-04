package ScannerBankExe;

public class Savings extends Account {
    private double interestRate = 0.8;


    // Default constructor
    public Savings(double balance) {
        super( balance );
    }

    public double getInterestRate(double amount) {
        return (amount * interestRate) / 100;
    }

    public void withdraw(double amount) {
        balance = this.balance - amount;
        System.out.println( " Saving after withDraw " + balance );
    }

    public void deposit(double amount) {
        balance = (amount + this.balance);
        double inte = getInterestRate( balance );
        balance = balance + inte;
        System.out.println( " Saving Deposit Amount with InterestRate:" + balance );
    }

    public void printBalance() {

        System.out.println( " saving Account balance money:" + this.balance );


    }
}
