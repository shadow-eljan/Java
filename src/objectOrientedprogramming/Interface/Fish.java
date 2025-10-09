package objectOrientedprogramming.Interface;

public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("The fish hunts smaller fish.");
    }

    @Override
    public void flee(){
        System.out.println("The fish runs from bigger fish.");
    }
}
