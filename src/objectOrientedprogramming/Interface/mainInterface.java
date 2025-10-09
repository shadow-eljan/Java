package objectOrientedprogramming.Interface;

public class mainInterface {
    public static void main(String[] args) {

            //INTERFACE =  A blueprint for a class that specifies a srt of
            // abstract methods that implementing classes MUST define.
            // Supports multiple inheritance-like behaviour

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Tiger tiger = new Tiger();

        tiger.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
