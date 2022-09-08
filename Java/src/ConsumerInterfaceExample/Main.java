package ConsumerInterfaceExample;


import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<StudentDetails> consumer = studentDetails -> System.out.println( studentDetails );
        ConsumerInterface.getListOfStudent().forEach( consumer );


    }
}

