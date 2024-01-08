package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2024-01-08");
        LocalDateTime d02 = LocalDateTime.parse("2024-01-08T14:19:00");
        Instant d03 = Instant.parse("2024-01-08T14:19:00Z");

        LocalDate pastWeekLocalDate = d01.minusWeeks(1);
        LocalDate nextWeekLocalDate = d01.plusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d02.plusWeeks(1);
        LocalDateTime pastWeekLocalDateTime = d02.minusWeeks(1);
        LocalDateTime nextFiveHoursLocalDateTime = d02.plusHours(5);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        System.out.println("\npastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextFiveHoursLocalDateTime = " + nextFiveHoursLocalDateTime);
        System.out.println(d01.plusWeeks(2));
        System.out.println();

        Duration t1 = Duration.between(d02.minusWeeks(5), d02.plusWeeks(5)); //calcula
        Duration t2 = Duration.between(LocalDateTime.now(), d02.plusWeeks(1)); //calcula
        Duration t3 = Duration.between(Instant.parse("2024-01-01T14:19:00Z"), d03);

        System.out.println("t1 = " + t1.toDays()); // toDays converte em dias
        System.out.println("t2 = " + t2.toDays()); // toDays converte em dias
        System.out.println("t3 = " + t3.toDays()); // toDays converte em dias


    }
}