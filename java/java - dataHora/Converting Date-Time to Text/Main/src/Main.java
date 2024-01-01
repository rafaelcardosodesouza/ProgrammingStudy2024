import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2024-01-12");
        LocalDateTime d02 = LocalDateTime.parse("2024-01-12T01:22");
        Instant d03 = Instant.parse("2024-01-12T01:32:00Z");

        //ref: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d01 = " + d01.format(fmt01));
        System.out.println("d01 = " + fmt01.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("\nd02 = " + d02.format(fmt02));
        System.out.println("d02 = " + fmt02.format(d02));
        System.out.println("d02 = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("d02 = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy mm:HH"))); //invert a hora pelos minutos
        System.out.println("\nd03 = " + fmt03.format(d03));
    }
}