package objectOrientedprogramming.Inheritance;

public class Animal extends organism{

    //INHERITANCE =  One class inherits
    // attributes and methods from another class.
    // Child <- Parent <- Grand Parents

    void eat(){
        System.out.println("This animal is eating.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        dog.speak();
        cat.speak();

        Plant plant = new Plant();

        plant.photosynthesize();

    }
}
