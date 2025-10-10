package objectOrientedprogramming.GettersAndSetters;

public class MainClass {
    public static void main(String[] args) {

        //Getter = methods that make field readable
        //Setter = Methods that make a field writeable
        // They help object data and rules for accessing and modifying

        Car car = new Car("Charger", "Yellow" , 10);

        car.setPrice(0);
        car.setColor("Blue");

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
