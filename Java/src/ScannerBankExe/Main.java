package ScannerBankExe;


public class Main {

    public static void main(String[] args) {
        Account currentAccount = new Current( 50000 );
        Account SavingAccount = new Savings( 50000 );
        BuildScanner buildScanner = new BuildScanner();
        buildScanner.mainMenuOption();
        buildScanner.showMenu( currentAccount, SavingAccount );

    }
}
