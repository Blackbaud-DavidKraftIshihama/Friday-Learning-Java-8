import java.util.function.*;

/**
 * Created by David.Kraft-Ishihama on 3/27/2014.
 */
public class a4_Function_Package {
    public static void main(String[] args) {
        Function<Integer, Integer> ex1 = a -> a + 5;
        Predicate<Integer> ex2 = a -> a > 5;
        Consumer<Integer> ex3 = a -> { System.out.println(a); };
        Supplier<Integer> ex4 = () -> (Integer.valueOf(5));
        BinaryOperator<Integer> ex5 = (a, b) -> (a + b);
        UnaryOperator<Integer> ex6 = a -> a + 1;

        System.out.println(ex1.apply(5));
        System.out.println(ex2.test(6));
        ex3.accept(7);
        System.out.println(ex4.get());
        System.out.println(ex5.apply(1, 1));
        System.out.println(ex6.apply(1));



        IntFunction<Double> prim1; //Takes an int and returns a Double
        IntToDoubleFunction prim2; //Takes an int and returns a double
        DoubleToIntFunction prim3; //Takes a double and returns an int
        IntPredicate prim4;        //Takes an int and returns a boolean
        DoubleConsumer prim5;      //Takes a double and returns nothing
        LongSupplier prim6;        //Takes nothing and returns a long
        LongBinaryOperator prim7;  //Takes two longs and returns a long
        DoubleUnaryOperator prim8; //Takes a double and returns a double
    }
}
