package Practise;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class practiseDateAndTime {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(instant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH-mm-ss");
        String newDate = LocalDateTime.now().format(formatter);
        System.out.println(newDate);
    }
}
