package Practise;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Time1 {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {

                System.out.println(count);
                count--;

                if (count <= 0) {
                    System.out.println("Task Completed.");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);

        Scanner scanner = new Scanner(System.in);

        Time2 tim = new Time2();

        Thread thread1 = new Thread(tim);
//        Thread thread2 = new Thread(tim);


//        thread1.start();
//        thread2.start();
        thread1.setDaemon(true);
        thread1.start();

        System.out.print("Enter your name within 5 seconds: ");
        String name = scanner.nextLine();

        System.out.println("Hello "+ name);

        scanner.close();
    }
}
