public class Savings extends Account {
    private double interestRate = 0.8;


    // Default constructor
    public Savings(double balance) {
        super( balance );
    }

    public double getInterestRate(double amount) {
        return (amount * interestRate) / 100;
    }

    public void Withdraw(double amount) {
        balance = this.balance - amount;
        System.out.println( "after withDraw Money" + balance );
    }

    public void Deposit(double amount) {
        balance = (amount + this.balance);
        double inte = getInterestRate( balance );
        balance = balance + inte;
        System.out.println( "Deposit Amount with InterestRate:" + balance );
    }

    public void printBalance() {

        System.out.println( "balance money:" + this.balance );


    }
}
