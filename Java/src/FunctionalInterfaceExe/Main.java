package FunctionalInterfaceExe;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Alex", 23);
        // Created a predicate. It returns true if age is greater than 18.
        PredicateDemo predicateDemo = new PredicateDemo();
       boolean eligible =  predicateDemo.isPersonEligibleForVoting(person , (p) -> p.age > 18);
        System.out.println("Person is eligible for voting: " + eligible);
        //System.out.println(predicate);

        TriConsumer function = (value, message, message2)  -> {
            System.out.println("value : " + value );
            System.out.println("message: " + message);
            System.out.println("messag2e: " + message2);
        };
        predicateDemo.myForEach(Arrays.asList("1", "B"), function);
    }
}
