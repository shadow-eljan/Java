package Array;

import java.util.Scanner;

public class userInputInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

//        foods[0] = "momo";
//        foods[1] = "Keema Noodles";

        System.out.print("How many foods name you want to enter? ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food name: ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("\nYou have entered:");
        for(String food : foods){
            System.out.println(food);
        }
        scanner.close();
    }

}
