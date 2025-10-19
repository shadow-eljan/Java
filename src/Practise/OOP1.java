package Practise;

public abstract class OOP1 {
    abstract void speak();

    public static void main(String[] args) {
        OOP2 two = new OOP2("Inheritance");
        two.speak();

        OOP3 three = new OOP3("Bugatti", 1999.99, "Polymorphism");
        three.Display();

    }
}
