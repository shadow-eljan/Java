package objectOrientedprogramming.constructor;

public class mainClass {
    public static void main(String[] args) {

        Car car1 = new Car("Ferrari", 19000, 2021, true);
        Car car2 = new Car("GTA", 200000, 2022, false);

        System.out.println(car1.name);
        System.out.println(car1.price);
        System.out.println(car1.year);
        System.out.println(car1.isRunning);

        System.out.println(car2.name);
        System.out.println(car2.price);
        System.out.println(car2.year);
        System.out.println(car2.isRunning);
    }
}
