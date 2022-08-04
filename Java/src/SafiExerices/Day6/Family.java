package SafiExerices.Day6;

import java.util.Objects;
import java.util.Scanner;

public class Family {

    public void mainMenuDetailsDisplay() {
        Member member = new Member();
        Scanner input = new Scanner( System.in );
        System.out.println( " A). Add a member" );
        System.out.println( " G). Greet all" );
        System.out.println( " E). Exit" );

        while (true) {
            System.out.println( "Type an option (A,G,E) : " );
            String letter = input.next();
            letter = letter.toUpperCase();
            if (Objects.equals( letter, "A" )) {
                member.addMembers( input );
            }
            if (Objects.equals( letter, "G" )) {
                member.greetAll();
            }
            if (Objects.equals( letter, "E" )) {
                System.out.println( "Exit the program" );
                break;
            }
        }
    }

}



