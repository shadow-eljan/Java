package Threading;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        //threading = Allows a program to run multiple tasks
        // simultaneously. Helps improve performance with time-consuming operations
        // (File I/O, network communication, or any background task)

        //How to create a thread
        //Option 1: Extend the Thread class (Simpler)
        //Option 2: Implement the runnable interface (Better)


        Scanner scanner = new Scanner(System.in);
        myRunnable myrun = new myRunnable();

        Thread thread = new Thread(myrun);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name.");


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello "+ name);


        scanner.close();
    }
}
