import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

//        LocalDate d1 = LocalDate.now();
//        LocalDateTime d2 = LocalDateTime.now();
//        Instant d3 = Instant.parse("2024-07-31T01:00:26Z");
//
//        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
//
//        System.out.println("D1: " + d1.format(fmt1) );
//        System.out.println("D2: " + d2.format(fmt1) );
//        System.out.println("D3: " + fmt2.format(d3) );


        // converção data-hora global para local
//
//        LocalDate dt4 = LocalDate.parse("2024-07-31");
//        LocalDateTime dt5 = LocalDateTime.parse("2024-07-31T01:39:26");
//        Instant dt6 = Instant.parse("2024-07-31T01:39:26Z");
//
//        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//
//        LocalDate r1 = LocalDate.ofInstant(dt6, ZoneId.systemDefault());
//        LocalDate r2 = LocalDate.ofInstant(dt6, ZoneId.of("Portugal"));
//        LocalDateTime r3 = LocalDateTime.ofInstant(dt6, ZoneId.systemDefault());
//        LocalDateTime r4 = LocalDateTime.ofInstant(dt6, ZoneId.of("Portugal"));
//
//        System.out.println("R1: " + r1.format(fmt1));
//        System.out.println("R2: " + r2.format(fmt1));
//        System.out.println("R3: " + r3.format(fmt2));
//        System.out.println("R4: " + r4.format(fmt2));

        //calculos data e hora

        LocalDate dt7 = LocalDate.parse("2024-07-31");
        LocalDateTime dt8 = LocalDateTime.parse("2024-07-31T01:39:26");
        Instant dt9 = Instant.parse("2024-07-31T01:39:26Z");

        LocalDate pastWeekLocalDate = dt7.minusWeeks(1);
        LocalDate nextWeek = dt7.plusWeeks(1);

        System.out.println("Past week: " + pastWeekLocalDate);
        System.out.println("Next week: "+ nextWeek);

        LocalDateTime pastWeekLocalDateTime = dt8.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = dt8.plusWeeks(1);

        System.out.println("Past week: " + pastWeekLocalDateTime);
        System.out.println("Next week: "+ nextWeekLocalDateTime);

        Instant pastWeekInstant = dt9.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = dt9.plus(7, ChronoUnit.DAYS);

        System.out.println("Past week: " + pastWeekInstant);
        System.out.println("Next week: "+ nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), dt7.atStartOfDay());

    }
}