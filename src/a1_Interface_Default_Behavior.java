/**
 * Created by David.Kraft-Ishihama on 3/24/2014.
 */
public class a1_Interface_Default_Behavior {
    public interface Sample {
        // The default keyword is required
        default void test() {
            System.out.println("This interface has default behavior");
        }
    }

    public static class Example1 implements Sample {}

    public static class Example2 implements Sample {
        @Override
        public void test() {
            System.out.println("Overridden default behavior");
        }
    }

    public static void main(String[] args) {
        Sample ex1 = new Example1();
        Sample ex2 = new Example2();

        ex1.test();
        ex2.test();
    }
}

// Note: You can not define default methods if the method is already in the Object class.
