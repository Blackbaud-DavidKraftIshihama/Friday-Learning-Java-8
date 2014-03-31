import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/**
 * Created by David.Kraft-Ishihama on 3/27/2014.
 */
public class a5_Streams {
    public static void main(String[] args) {
        int [] numbers = {
                0, 1, 1, 8, 9, 9, 9, 8, 8, 1, 9, 9, 9, 1, 1, 9, 7, 2, 5,
                3
        };
        // Well that's easy to remember.

        Arrays.stream(numbers)
                .filter( (number) -> ( number > 1) )
                .map( (number) -> (2 * number) )
                .skip(8)
                .limit(5)
                .forEach((x) -> {System.out.println(x);});

        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }
}
