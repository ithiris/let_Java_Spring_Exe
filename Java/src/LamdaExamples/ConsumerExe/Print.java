package LamdaExamples.ConsumerExe;



public class Print<T> implements MyConsumer<T> {
    String name;

    public Print(String ss) {
        this.name = ss;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public void accept(T t) {
        System.out.println( "hello india" );
    }
}
