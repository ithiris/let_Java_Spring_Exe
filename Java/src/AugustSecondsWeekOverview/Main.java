package AugustSecondsWeekOverview;

import LamdaExamples.Pencil;


import java.util.List;

public class Main {
    public static void main(String[] args) {
       MyList list  = new MyList( List.of("1", "hello"));
        List<String> strings = List.of("1", "2", "3");


        /*list.forEach( (value) -> {
            System.out.println(value);
        });

        list.forEach( new Pencil() ::draw2);*/
        TriConsumer consumer1 = (a, b , c) -> {

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        };
        myForEach(strings ,consumer1 );

        /*TriConsumer consumer2 =(a, b , c) -> {

            System.out.println(a + "hell");
            System.out.println(b);
            System.out.println(c);
        };

        TriConsumer consumer3 = consumer1.andThen(consumer2);


        myForEach(strings, consumer3);*/

    }
    public static void myForEach(List<String> values, TriConsumer function) {


        for (String val : values) {
            function.myAccept(val, "hello", "hello2");
        }

    }
}
