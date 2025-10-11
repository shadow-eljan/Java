package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class LearningArrayList {
    public static void main(String[] args) {

        //ArrayList = A resizable array that stores objects (Autoboxing)
        //They are not fixed.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(123);
        list.add(12);
        list.add(1);

        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Jackfruit");

//        fruits.remove("Apple");
//        fruits.remove(1);
//        fruits.set(0, "Pineapple");

        Collections.sort(fruits);

        System.out.println(fruits);

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of food you like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i =1; i<= numOfFood; i++){
            System.out.print("Enter the food name "+i +" : ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println("You have entered: ");
        System.out.println(foods);
    }
}
