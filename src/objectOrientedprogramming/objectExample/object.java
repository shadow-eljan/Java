package objectOrientedprogramming.objectExample;

public class object {
    public static void main(String[] args) {

        // OBJECT = AN ENTITY THAT HOLDS DATA(ATTRIBUTES)
        // AND PERFORM CERTAIN ACTIONS(METHODS)
        //IT IS A REFERENCE DATA TYPE

        Vehicle car = new Vehicle();

//        car.isRunning = false;

        System.out.println(car.name);
        System.out.println(car.price);
        System.out.println(car.year);
        System.out.println(car.isRunning);


        car.start();
        System.out.println(car.isRunning);

        car.stop();
        System.out.println(car.isRunning);
    }
}
