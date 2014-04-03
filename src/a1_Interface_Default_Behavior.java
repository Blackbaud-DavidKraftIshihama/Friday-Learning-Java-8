/**
 * Created by David.Kraft-Ishihama on 3/24/2014.
 */
public class a1_Interface_Default_Behavior {
    public interface DefaultInterface {
        default void test() {
            System.out.println("This interface has default behavior");
        }
    }

    public static class InheritBehavior implements DefaultInterface {

    }

    public static class OverrideBehavior implements DefaultInterface {
        @Override
        public void test() {
            System.out.println("Overridden default behavior");
        }
    }

    public static void main(String[] args) {
        DefaultInterface inherit = new InheritBehavior();
        DefaultInterface override = new OverrideBehavior();

        inherit.test();
        override.test();
    }
}

// Note: You can not define default methods if the method is already in the Object class.
