package ScannerBankExe;

public class Account {
    protected double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {

        balance = balance - amount;
        System.out.println( " current Account after withDraw " + balance );

    }
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println( "Current Account Deposit Amount:" + balance );
    }

    public void printBalance() {
        System.out.println( "balance money:" + getBalance() );

    }
}
