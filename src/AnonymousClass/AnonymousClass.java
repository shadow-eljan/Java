package AnonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {

        //Anonymous Class = A class that doesn't have a name.
        // Cannot be reused.
        // Add custom behaviour without having to create a new class.
        // Often used for ine time uses (TimerTask, Runnable, Callback).


        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
          @Override
          void speak(){
              System.out.println("Scooby Doo talks English.");
          }
        };

        dog1.speak();
        dog2.speak();

    }
}
