public class Main {
    public static void main(String[] args) {
        Account SAccount = new Savings(50000);

        SAccount.Deposit(1000);
        SAccount.printBalance();

        SAccount.Withdraw(3000);
        SAccount.printBalance();



    }
}
