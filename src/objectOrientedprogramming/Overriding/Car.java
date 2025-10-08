package objectOrientedprogramming.Overriding;

public class Car extends learningToString{

    Car(String name, String model, int year, double price){
        super(name, model, year, price);
    }

    @Override
    public String toString(){
        return this.name + " " + this.model + " " + this.year + " " + this.price;
    }
}
