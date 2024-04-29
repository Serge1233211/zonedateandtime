import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        /*for (String s: ZoneId.getAvailableZoneIds ())
            System.out.println(s);*/
        ZoneId zone = ZoneId.of("America/Toronto");
        ZonedDateTime time = ZonedDateTime.now(zone) ;

        System.out.println(time);
    }
}