package SafiExerices.Day5;

import java.util.ArrayList;
import java.util.List;

public class Family {
    List list = new ArrayList<Person>();

    public void addMembers(Person person) {

        list.add( person );

    }

    public void greet() {


        this.list.forEach( (l) -> System.out.println( l.toString() ) );
    }
}
