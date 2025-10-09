package objectOrientedprogramming.RuntimePolymorphism;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        //Runtime Polymorphism = When the method gets executed is decided
        // at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        Animal animal;

        if (choice == 1){
            animal = new Dog();
            animal.speaks();
        }else if (choice == 2){
            animal = new Cat();
            animal.speaks();
        }
    }
}
