package ConsumerInterfaceExample;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterface {

    public static List <StudentDetails> getListOfStudent(){

        return Arrays.asList(new StudentDetails( "john","mick" ), new StudentDetails( "Rashik","Khan" ));
    }
}
