
public class a3_Lambdas {
    // Abstract classes do not work with lambdas. You must use a functional interface.
    @FunctionalInterface
    public interface Example {
        // Note: Default methods are not compatible with lambdas or the FunctionalInterface annotation.
        public int test(Integer f);

        // But static methods are.
        public static int test2(Integer a) { return 5 + a; }
    }

    public static void main(String[] args) {
        // You can capture this int in a lambda, but it must be "effectively final".
        // You will take a performance hit for doing this.
        int y = 5;

        // This is the Java 7 way of doing this.
        Example ex1 = new Example() {
            public int test(Integer f) {
                return y + f;
            }
        };

        // Java 8 allows you to do this instead if your method simply returns an expression.
        Example ex2 = (Integer a) -> (y + a);
        Example ex3 = (a) -> (y + a);
        Example ex4 = a -> y + a;

        // Curly braces will allow you to define your lambda as a series of statements instead of an expression.
        Example ex5 = (a) -> {
            return y + a;
        };

        // Got some other method with a matching type signature? You can reference it!
        Example ex6 = Example::test2;    // Static method reference
        Example ex7 = Integer::new;      // Constructor reference
        Example ex8 = ex1::test;         // Specific instance method reference
        Example ex9 = Integer::intValue;  // Arbitrary instance method reference
        Example ex10 = Object::hashCode;

        System.out.println(ex1.test(1));
        System.out.println(ex2.test(2));
        System.out.println(ex3.test(3));
        System.out.println(ex4.test(4));
        System.out.println(ex5.test(5));
        System.out.println(ex6.test(6));
        System.out.println(ex7.test(7));
        System.out.println(ex8.test(8));
        System.out.println(ex9.test(9));
        System.out.println(ex10.test(10));
    }
}