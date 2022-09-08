package MyIteratorImplementaion;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyString st1 = new MyString( "Hello" );

        Iterator<String> iterator = st1.iterator();

        while (iterator.hasNext()) {

            String next = iterator.next();
            System.out.println( next );
        }
    }
}
