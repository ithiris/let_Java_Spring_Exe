package SafiExerices.Day2.exe2;

public class Chocolate {
    String name;
    static int QUANTITY_lIMIT = 10;
    int count;

    public Chocolate(String name, int count) {
        this.name = name;
        this.count = count;

    }

    public void getChocolateCount() {

        if (QUANTITY_lIMIT < count) {
            System.out.println( this.name + " you want " + " " + count + " Chocolate but  available Chocolate is " + QUANTITY_lIMIT );
        } else {

            QUANTITY_lIMIT = QUANTITY_lIMIT - count;
            System.out.println( this.name + " took " + count + " chocolate is Remaining " + QUANTITY_lIMIT );
        }


    }
}
