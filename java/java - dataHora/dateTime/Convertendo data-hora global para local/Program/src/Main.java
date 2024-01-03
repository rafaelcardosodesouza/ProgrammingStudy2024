import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2024-01-03");
        LocalDateTime d02 = LocalDateTime.parse("2024-01-03T01:11");
        Instant d03 = Instant.parse("2024-01-03T01:11:00Z");

        /*
        for(String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
        */

        LocalDate result1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate result2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        LocalDateTime result3 = LocalDateTime.ofInstant(d03, ZoneId.of("Europe/Berlin"));

        System.out.println("result1 = " + result1);
        System.out.println("result2 (Portugal) = " + result2);
        System.out.println("result3 (Europe/Berlin) = " + result3);

        System.out.println("\nresult3 = " + result3);
        System.out.println("getDayOfWeek of result3 = " + result3.getDayOfWeek());
        System.out.println("getDayOfMonth of result3 = " + result3.getDayOfMonth());
        System.out.println("getHour of result3 = " + result3.getHour());
        System.out.println("getMonth of result3 = " + result3.getMonth());
        System.out.println("getMonthValue of result3 = " + result3.getMonthValue());
    }
}