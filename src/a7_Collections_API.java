import java.util.*;
import java.util.function.Consumer;

/**
 * Created by David.Kraft-Ishihama on 3/27/2014.
 */
public class a7_Collections_API {
    public static void main(String[] args) {
        Consumer<Integer> printAll = (num) -> { System.out.println(num); };

        Collection<Integer> numberCollection = new ArrayList<Integer>();
        numberCollection.addAll(Arrays.asList(9, 0, 2, 1, 0));
        List<Integer> numberList = Arrays.asList(81, 4, 17, 20, 3, 100, 50, 27, 82);
        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();

        numberCollection.removeIf(a -> a % 2 == 1);
        numberCollection.forEach(printAll);

        numberList.sort(Integer::compareTo);
        numberList.replaceAll(a -> 2 * a);
        Iterator<Integer> iterator = numberList.iterator();
        System.out.println(iterator.next());
        iterator.forEachRemaining(printAll);

        numberMap.putIfAbsent(5, 5);
        numberMap.putIfAbsent(5, 7);
        System.out.println(numberMap.get(5));
        numberMap.remove(5, 7);
        System.out.println(numberMap.get(5));
        numberMap.remove(5, 5);
        System.out.println(numberMap.get(5));

        System.out.println(numberMap.getOrDefault(5, 1337));
    }
}
