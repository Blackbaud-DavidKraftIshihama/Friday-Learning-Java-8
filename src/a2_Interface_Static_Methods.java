/**
 * Created by David.Kraft-Ishihama on 3/24/2014.
 */
public class a2_Interface_Static_Methods {
    public interface StaticTest {
        static void staticExample() {
            System.out.println("Static methods must be defined");
        }

        static StaticTest createInstance() {
            System.out.println("Used the static interface to create this class!");
            return new StaticTestImpl();
        }
    }

    public static class StaticTestImpl implements StaticTest {
        public String toString() {
            return "instance of StaticTestImpl";
        }
    }

    public static void main(String[] args) {
        StaticTest.staticExample();
        StaticTest obj = StaticTest.createInstance();
        System.out.println(obj.toString());
    }
}
