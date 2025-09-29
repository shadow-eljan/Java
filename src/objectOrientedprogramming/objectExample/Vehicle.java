package objectOrientedprogramming.objectExample;

public class Vehicle {


    String name = "Bugatti";
    double price = 19000.99;
    int year = 2025;
    boolean isRunning = true;


    void start() {
        isRunning = true;
        System.out.println("You started the Engine.");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stopped the engine");
    }
}