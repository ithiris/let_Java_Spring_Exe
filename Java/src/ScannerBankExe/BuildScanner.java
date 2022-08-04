package ScannerBankExe;

import java.util.Scanner;

public class BuildScanner {
    public void mainMenuOption() {
        System.out.println( "Please Select an option below:" );
        System.out.println( "Press 1 to Deposit Amount." );
        System.out.println( "Press 2 to Withdraw Amount." );
        System.out.println( "Press 3 to View Balance" );
        System.out.println( "Press any key to Exit" );
        System.out.println( " " );
    }

    public void showMenu(Account cuAccount, Account savingAccount) {

        Scanner scanner = new Scanner( System.in );
        System.out.print( "press key  for transaction : " );
        int selectedOption = scanner.nextInt();
        switch (selectedOption) {
            case 1:
                System.out.print( "Please Enter the amount to Deposit: " );
                int depositAmt = scanner.nextInt();
                cuAccount.deposit( depositAmt );
                savingAccount.deposit( depositAmt );
                showMenu( cuAccount, savingAccount );

            case 2:
                System.out.print( "Please Enter the amount to withdraw: " );
                int withDrawAmt = scanner.nextInt();
                cuAccount.withdraw( withDrawAmt );
                savingAccount.withdraw( withDrawAmt );
                showMenu( cuAccount, savingAccount );

            case 3:
                System.out.println( "Your Current Account Balance is " + cuAccount.getBalance() + " Rupees" );
                System.out.println( "Your Savings Account Balance is " + savingAccount.getBalance() + " Rupees" );
                showMenu( cuAccount, savingAccount );

            default:
                System.out.println( "Transaction Ended Account Logout Successfully !" );
                System.exit( 0 );
                break;
        }

    }
}
