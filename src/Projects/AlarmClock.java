package Projects;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {

        //JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        while (alarmTime == null){
            try{
                System.out.print("Enter an alarm time: (HH:MM:SS) ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for "+ alarmTime);
            } catch (DateTimeException e) {
                System.out.println("Invalid Format. Use HH:MM:SS format.");
            }
        }

        AlarmClockTwo alarmclocktwo = new AlarmClockTwo(alarmTime);
        Thread alarmThread = new Thread(alarmclocktwo);
        alarmThread.start();

        scanner.close();

    }
}
