package Practise;

public class OOP3 {
    String carName;
    double carPrice;

    OOP2 oop;


    OOP3(String name, double price, String type){
        this.carName = name;
        this.carPrice = price;
        this.oop = new OOP2(type);
    }
    void Display(){
        this.oop.display();
        System.out.println("OOP3 running.");
    }
}
