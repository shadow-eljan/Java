package Practise;

public class Movie {
    String movieName;
    double price;

    Movie(String name, double money){
        this.movieName = name;
        this.price= money;
    }

    void displayInfo(){
        System.out.println("Name: " + this.movieName + "\nPrice: $" + this.price + "\n");
    }
}
