package objectOrientedprogramming.objectExample;

public class arrayOfObjects {
    public static void main(String[] args) {

        Animal a1 = new Animal("Cat", "Mammal");
        Animal a2 = new Animal("Dog", "Mammal");
        Animal a3 = new Animal("Elephant", "Mammal");

        Animal[] animals = {a1, a2, a3};

//        Animal[] animals = {new Animal("Cat",
//                "Mammal"), new Animal("Dog",
//                "Mammal")};
        //ANONYMOUS OBJECT

        for(Animal animal : animals ){
            animal.species = "Apple";
            animal.eat();

        }

        //STATIC = makes a variable belong to class but not to a
        // specific object.
        // It is commonly used for utility or shared resources.

        System.out.println("\n"+ a1.numOfAnimals + " Animals found.");
    }
}
