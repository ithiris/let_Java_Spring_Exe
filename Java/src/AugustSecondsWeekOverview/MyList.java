package AugustSecondsWeekOverview;




import java.util.List;
import java.util.function.Consumer;

public class MyList {

        private final List<String> list;

        public MyList(List<String> list){
            this.list = list;
        }


        public void forEach(Consumer consumer) {

            for(String  value : list){
                consumer.accept(value);
            }

        }
}
