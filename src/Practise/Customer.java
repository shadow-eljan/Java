package Practise;

import java.util.HashMap;

public class Customer<U, T>{

    public static void main(String[] args) {

        Products<String, Double> products = new Products<String, Double>("Apple", 123.99);
        System.out.println("Item: "+ products.getItem());
        System.out.println("Price: $"+ products.getPrice());

        HashMap<String, Double> shop = new HashMap<>();
        shop.put("Apple", 19.99);
        shop.put("Ball", 20.00);
        shop.put("Cat", 300.00);

        System.out.println( shop.containsValue(20.00));
        for(String key: shop.keySet()){
            System.out.println(key + " " + shop.get(key) );
        }
    }
}
