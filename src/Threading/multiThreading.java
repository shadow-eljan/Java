package Threading;

import java.sql.SQLOutput;

public class multiThreading {
    public static void main(String[] args) {

        //Multithreading = Enables a program to run multiple threads
        // simultaneously


        Thread thread1 = new Thread(new myRunnableTwo("HAPPY"));
        Thread thread2 = new Thread(new myRunnableTwo("SAD"));

        System.out.println("START");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread was Interrupted");
        }

        System.out.println("STOP");
    }
}
