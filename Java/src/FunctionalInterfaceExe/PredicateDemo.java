package FunctionalInterfaceExe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate) {
        return predicate.test( person );
    }


    public  static void myForEach(List<String> values, TriConsumer function ) {


        for (String val:values){
            function.myAccept(val, "hello", "hello2");
        }

    }
}
