package objectOrientedprogramming.Composition;

public class MainComposition {
    public static void main(String[] args) {

        //Composition = Represents a "part -off" relationship.
        // EG: An engine is part of a car
        // Allows complex object to be constructed from smaller objects
        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.enginetype);
        car.start();
    }
}
