import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.*;

/**
 * Created by David.Kraft-Ishihama on 3/27/2014.
 */
public class a6_Time {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate lastYear = LocalDate.now().minusYears(1);
        LocalTime nextHour = LocalTime.now().plusHours(1);
        LocalTime TwoForty = LocalTime.of(2, 40);
        LocalDate Christmas = LocalDate.of(2014, 12, 25);
        LocalDateTime TwoFortyChristmas = LocalDateTime.of(Christmas, TwoForty);

        System.out.println(now);
        System.out.println(lastYear);
        System.out.println(nextHour);
        System.out.println(TwoForty);
        System.out.println(Christmas);
        System.out.println(TwoFortyChristmas);

        System.out.println(Christmas.getDayOfWeek());
        System.out.println(Christmas.getMonth());

        System.out.println(ChronoUnit.DAYS.between(now, TwoFortyChristmas));
        System.out.println(Christmas.with(TemporalAdjusters.firstDayOfNextMonth()));

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(formatter.format(Christmas));
        System.out.println(formatter2.format(Christmas));
    }
}
