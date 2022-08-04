public class Account {
    protected double balance;


    public Account(double balance) {
        this.balance = balance;

    }

    public double getBalance() {

        return balance;
    }

    public void Withdraw(double amount) {

        balance = balance - amount;
        System.out.println( "after withDrawMoney" + balance );

    }

    public void Deposit(double amount) {
        balance = balance + amount;
        System.out.println( "Deposit Amount:" + balance );
    }

    public void printBalance() {
        System.out.println( "balance money:" + getBalance() );

    }
}
