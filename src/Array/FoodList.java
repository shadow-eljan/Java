package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodList {
    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();

        foods.add("MOMO");
        foods.add("KEEMA NOODLES");
        foods.add("LAPHING");
        foods.add("SAUSAGE");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name you want to enter: ");
        String text = scanner.nextLine().toUpperCase();


        if (foods.contains(text)) {
            System.out.println(text + " found.");
        } else {
            System.out.println(text + " not found.");
        }

        scanner.close();
    }
}
