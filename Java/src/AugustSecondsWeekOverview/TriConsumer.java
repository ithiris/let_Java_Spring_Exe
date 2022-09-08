package AugustSecondsWeekOverview;

public interface TriConsumer {
    void myAccept(String a, String b, String c);

    default TriConsumer andThen(TriConsumer after) {

        return (a, b, c) -> {
            myAccept(a,b,c);
            after.myAccept(a,b,c);
        };
    }
}

