package SafiExerices.Day2;

public class Main {
    public static void main(String[] args) {
        ChocolateBox chocolateBox = new ChocolateBox();
        Employee safi = new Employee( "Safi" );
        safi.setChocolateBox( chocolateBox );

        try {
            safi.openChocolateBox();
            safi.takeChocolate( 1 );
        } catch (Exception var6) {
            System.out.println( "not able to open the box" );
        }

        Employee fawaz = new Employee( "Fawaz" );
        fawaz.setChocolateBox( chocolateBox );

        try {
            fawaz.openChocolateBox();
            fawaz.takeChocolate( 1 );
        } catch (Exception var5) {
            System.out.println( "not able to open the box" );
        }

    }

}
