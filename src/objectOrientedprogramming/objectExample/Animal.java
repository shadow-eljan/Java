package objectOrientedprogramming.objectExample;

public class Animal {
    String name;
    String species;

    Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    void eat(){
        System.out.println(name + " is a "+ species);
        System.out.println("It eats Grass or Meat.");
    }
}
