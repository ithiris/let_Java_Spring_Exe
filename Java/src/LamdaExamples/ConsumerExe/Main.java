package LamdaExamples.ConsumerExe;


import java.util.function.Consumer;


public class Main {
    public static <T> void main(String[] args) {

       MyConsumer myConsumer = new MyConsumer() {
            @Override
            public void accept(Object o) {
                System.out.println( "hello world" );
            }
        };

        myConsumer.accept( "" );


        MyConsumer consumerTwo = (s) -> System.out.println( new Print( "rashikKhan" ) );
        consumerTwo.accept( "" );

       // consumer Interface using Lambda expression
        Consumer consumer = (val) -> System.out.println( val );
        consumer.accept( 10 * 2 );

        Print print = new Print( "fawaz" );

        print.accept( "" );

        MyConsumer consumerObj = getPrintName();
        consumerObj.accept( "" );

        MyConsumer consumerTwo2 = (s) -> System.out.println( new Print( "rashikKhan" ) );
        consumerTwo2.accept( "" );

    }

    public static MyConsumer getPrintName() {

        return (ConsumerAcFun) -> System.out.println( "ithiris" );
    }
}

