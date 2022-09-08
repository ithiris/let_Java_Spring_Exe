package LamdaExamples;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return new Pencil();
            }
        };

        Supplier<Pencil> supplier1 = () ->  new Pencil() ;

        Consumer consumer = (val) -> System.out.println(val);
        consumer.accept("hello");




        IDrawable drawable = new IDrawable() {
            @Override
            public void draw() {
                System.out.println("drawing");
            }
        };
        drawable.draw();


        IDrawable lamdaDrawable = () -> System.out.println("drawing");
        lamdaDrawable.draw();


        draw(() -> System.out.println("drawing"));

        draw(() -> System.out.println("Pen drawing"));

        IDrawable drawObject = getDrawObject();
        drawObject.draw();
    }

    public static void draw(IDrawable drawable) {
        drawable.draw();
    }

    public static IDrawable getDrawObject(){
        return  ()  -> System.out.println("Drawing");
    }
}
