package Generics;

public class Generics {
    public static void main(String[] args) {

        //Generics.Generics = A concept where you can write a class, or method
        // that is compatible with different data types.
        // <T> type parameter
        // <Any DataType> type argument

        Box<Integer> box1 = new Box<Integer>();
        box1.setItem(1);
        Box<String> box2 = new Box<String>();
        box2.setItem("Apple");

        System.out.println(box1.getItem());
        System.out.println(box2.getItem());

        System.out.println();

        Product<String, Double> product = new Product<String, Double>("Laptop", 200000.00);
        System.out.println("Item: " + product.getItem());
        System.out.println("Price: " + product.getPrice());

    }
}
