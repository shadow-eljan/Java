package objectOrientedprogramming.Overriding;

public class Animal {

    public static void main(String[] args) {

        //METHOD OVERRIDING = subclass provides its own implementation
        // of method which is defined in the main class



        Cat cat = new Cat();
        Fish fish = new Fish();
        Dog dog = new Dog();

        cat.move();
        fish.move();
        dog.move();

    }
    void move(){
        System.out.println("This animal is moving.");
    }
}
