package MyIteratorImplementaion;


import java.util.Iterator;

public class MyString<T> implements Iterable<T> {

    private String str = "";
    private int currentSize;

    public MyString(String str) {
        this.str = str;
        this.currentSize = str.length();
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize;
            }

            @Override
            public T next() {

                String letter = Character.toString( str.charAt( currentIndex++ ) );

                return (T) letter;
            }
        };
        return it;
    }

}

