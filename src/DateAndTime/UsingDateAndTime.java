package DateAndTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsingDateAndTime {
    public static void main(String[] args) {

        // Work with DATES and TIMES
        //(LocalDate, LocalTime, LocalDateTime, UTC timestamp)

//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime both = LocalDateTime.now();
//        Instant instant = Instant.now();
//
//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(both);
//        System.out.println(instant);

        //Custom formatter

//        LocalDateTime dateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
//        String newDateTime = dateTime.format(formatter);
//        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2024,12,25, 12,0,0);
        LocalDateTime date2 = LocalDateTime.of(2024,1,2, 12,0,0);

        if (date1.isBefore(date2)){
            System.out.println("Happy Christmas");
        }else{
            System.out.println("A bit early for Christmas.");
        }
    }
}
