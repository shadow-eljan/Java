package TimerAndTimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class MainClass {
    public static void main(String[] args) {

        //Timer = Class that schedules tasks at specific time
        //or periodically.
        // Useful for: sending notifications, schedule update

        //TimerTask = Represents the task that will be executed by the
        // Timer.

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if(count<=0){
                    System.out.println("Task Completed.");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }
}
