/**
 * Created by David.Kraft-Ishihama on 3/24/2014.
 */
public class a2_Interface_Static_Methods {
    public interface StaticTest {
        // You must define behavior in the static method.
        static void example() {
            System.out.println("Static methods must be defined");
        }

        static StaticTest createInstance() {
            System.out.println("Used the static interface to create this class!");
            return new NewClass();
        }
    }

    public static class NewClass implements StaticTest {
        public String toString() {
            return "instance of NewClass";
        }
    }

    public static void main(String[] args) {
        StaticTest.example();
        StaticTest obj = StaticTest.createInstance();
        System.out.println(obj.toString());
    }
}
