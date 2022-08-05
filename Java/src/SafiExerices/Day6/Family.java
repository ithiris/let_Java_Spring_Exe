package SafiExerices.Day6;

import java.util.Objects;
import java.util.Scanner;

public class Family {

    public void menuOptions() {
        System.out.println( " A). Add a member" );
        System.out.println( " G). Greet all" );
        System.out.println( " E). Exit" );

    }

    public void mainMenuDetailsDisplay() {
        Member member = new Member();
        Scanner input = new Scanner( System.in );

        while (true) {
            System.out.println( "Type an option (A,G,E) : " );
            String letter = input.next();
            letter = letter.toUpperCase();
            if (Objects.equals( letter, "A" )) {
                System.out.println( "Please Enter the name" );
                String name = input.next();
                System.out.println( "Please Enter the age" );
                int age = input.nextInt();
                member.addMembers( name, age );
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









