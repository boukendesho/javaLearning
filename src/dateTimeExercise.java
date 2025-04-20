import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dateTimeExercise {
    public static void main(String[] args) {
        Date now = new Date();
        // getTime -> unix timestamp
        System.out.println(now.getTime());
        // Direct -> Weekday Month dayOfMonth Hours:Minutes:seconds timezone year
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.now();
        // year-month-day-T-hours:minutes:seconds.milliseconds
        System.out.println(localDateTime);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("u-MM-d H:m:s");
        System.out.println(myFormatter);

        String formattedDate = localDateTime.format(myFormatter);
        System.out.println(formattedDate);

    }
}
