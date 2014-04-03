/**
 * Created by David.Kraft-Ishihama on 3/24/2014.
 */
public class a3_Lambdas {
    // Abstract classes do not work with lambdas. You must use a functional interface.
    @FunctionalInterface
    public interface FuncInterface {
        public int calculate(Integer f);

        public static int staticMethod(Integer a) {
            return 5 + a;
        }
    }

    public static void main(String[] args) {
        // This is the Java 7 way of doing this.
        FuncInterface ex1 = new FuncInterface() {
            @Override
            public int calculate(Integer a) {
                return 5 + a;
            }
        };

        // Java 8 allows you to do this instead if your method simply returns an expression.
        FuncInterface ex2 = (Integer a) -> (5 + a);
        FuncInterface ex3 = (a) -> (5 + a);
        FuncInterface ex4 = a -> 5 + a;

        // Curly braces will allow you to define your lambda as a series of statements instead of an expression.
        int y = 5;
        FuncInterface ex5 = (a) -> {
            return y + a;
        };

        // Got some other method with a matching type signature? You can reference it!
        FuncInterface ex6 = FuncInterface::staticMethod;    // Static method reference
        FuncInterface ex7 = a -> FuncInterface.staticMethod(a);

        FuncInterface ex8 = Integer::new;      // Constructor reference
        FuncInterface ex9 = a -> new Integer(a);

        FuncInterface ex10 = ex1::calculate;         // Specific instance method reference
        FuncInterface ex11 = a -> ex1.calculate(a);

        FuncInterface ex12 = Integer::intValue; // Arbitrary instance method reference
        FuncInterface ex13 = a -> a.intValue();

        System.out.println(ex1.calculate(1));
        System.out.println(ex2.calculate(2));
        System.out.println(ex3.calculate(3));
        System.out.println(ex4.calculate(4));
        System.out.println(ex5.calculate(5));
        System.out.println(ex6.calculate(6));
        System.out.println(ex7.calculate(7));
        System.out.println(ex8.calculate(8));
        System.out.println(ex9.calculate(9));
        System.out.println(ex10.calculate(10));
        System.out.println(ex11.calculate(11));
        System.out.println(ex12.calculate(12));
        System.out.println(ex13.calculate(13));
    }
}