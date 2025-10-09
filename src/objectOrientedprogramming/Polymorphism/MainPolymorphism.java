package objectOrientedprogramming.Polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {

        //POLYMORPHISM == poly = many
        //              == morph = shape
        // Objects can identify as other objects
        // Objects can be treated as objects of common superclass.


        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
