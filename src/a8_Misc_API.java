import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by David.Kraft-Ishihama on 3/31/2014.
 */
public class a8_Misc_API {
    public static class Person {
        public String getLastName() { return null; }
        public String getFirstName() { return null; }
        public String getEmailAddress() { return null; }
    }

    public static void main(String[] args) {
        // Old way of initializing ThreadLocal:
        ThreadLocal<List<String>> oldThreadLocalString = new ThreadLocal<List<String>>() {
            @Override
            public List<String> initialValue() {
                return new ArrayList<>();
            }
        };
        System.out.println(oldThreadLocalString.get());

        // New way:
        ThreadLocal<List<String>> newThreadLocalString = ThreadLocal.withInitial(ArrayList::new);
        System.out.println(newThreadLocalString.get());

        // Java Optional
        Optional<Integer> optional;

        // Methods in Comparator
        List<Person> people = new ArrayList<>();
        people.sort(
                Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .thenComparing(
                        Person::getEmailAddress,
                        Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)
                )
        );
        // TODO: I'm still confused by my own shit here

        try {
            Stream stream = Files.list(Paths.get("c:\\temp\\"));
            stream = Files.lines(Paths.get("c:\\temp\\"), Charset.forName("UTF_32"));
            stream = Files.find(Paths.get("c:\\"),
                    5,
                    (T, U) -> (T == U)
            );

        } catch (IOException e) {
            UncheckedIOException ex = new UncheckedIOException("cause", e);
            System.out.println(ex.getMessage());
        }

        String joinExample = String.join(",", "a", "b", "c", "4", "E", "6");
        System.out.println(joinExample);

        System.out.println(String.join(" ", Arrays.asList("1", "2", "3", "4", "5")));
        StringJoiner joiner = new StringJoiner("-");
        joiner.add("abbie");
        joiner.add("doobie");
        System.out.println(joiner.toString());
    }
}
