package objectOrientedprogramming.constructor;

public class Car {
    String name;
    double price;
    int year;
    boolean isRunning;

    Car(String name, double price, int year, boolean isRunning) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.isRunning = isRunning;
    }

    void start() {
        isRunning = true;
        System.out.println("You started the Engine.");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stopped the engine");
    }
}
