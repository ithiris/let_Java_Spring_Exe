package MyFilterImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Anonymous class implementation

        MyFilter filter = new MyFilter() {
            @Override
            public List<Integer> test(List<Integer> ages) {
                List<Integer> result = new ArrayList();
                ages.forEach( age -> {
                    if (age > 10) {
                        int resultAge = age;
                        result.add( resultAge );

                    }
                } );
                return result;
            }
        };

        List<Integer> output = filter.test( Arrays.asList( 5, 7, 8, 10, 12, 18, 20, 25 ) );
        System.out.println( output );

        //Lambda Expression Implementation
        MyFilter lamExpResult = (ages) -> {
            List<Integer> lambdaResult = new ArrayList();
            ages.forEach( age -> {
                if (age < 10) {
                    int resultAge = age;
                    lambdaResult.add( resultAge );
                }
            } );
            return lambdaResult;
        };
        myFilter( Arrays.asList( 5, 7, 8, 10, 12, 18, 20, 25 ), lamExpResult );


    }

    public static void myFilter(List<Integer> values, MyFilter lamExp) {
        List<Integer> testResult = lamExp.test( values );
        System.out.println( testResult );
    }
}






