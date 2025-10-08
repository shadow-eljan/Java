package objectOrientedprogramming.Overriding;

public class learningToString {
    String name;
    String model;
    int year;
    double price;

    learningToString(String name, String model, int year, double price){
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static void main(String[] args) {

        Car car = new Car("Bugatti Chiron", "IDK", 2025, 9999999.00);
        Car car2 = new Car("Chevrolet", "Corvette", 2026, 99999.00);

        System.out.println(car);
        System.out.println(car2);
    }
}
