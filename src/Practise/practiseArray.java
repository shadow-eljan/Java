package Practise;

import Array.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class practiseArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        System.out.println(numbers[1]);

        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Enter how many number you want to enter: ");
        size = scanner.nextInt();
        scanner.nextLine();

        int[] array;
        array = new int[size];

        for(int i =0; i<array.length; i++){
            System.out.println("Enter a number:");
            array[i]=scanner.nextInt();
        }


        System.out.println("\nYou have entered: ");
        for (int arr: array){
            System.out.println(arr);
        }

        String[] foods;
        String target;
        boolean isFound= false;

        System.out.print("How many foods you want to enter: ");
        int size2 = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size2];

        for(int i =0; i<foods.length; i++){
            System.out.print("Enter the food name:");
            foods[i]=scanner.nextLine();
        }

        System.out.print("What do you want to search: ");
        target = scanner.nextLine();

        for(String food: foods){
            if(food.equals(target)){
                System.out.println(target + " Found.");
                isFound=true;
                break;
            }else{
                isFound=false;
            }
        }

        if(!isFound){
            System.out.println(target + " Not Found.");
        }

        String[] fruits = {"apple", "mango"};
        String[] games = {"football", "pubg"};
        String[] animals = {"cat", "dog"};

        String[][] all = {fruits, games, animals};

        for(String[] items: all){

            for(String names: items){

                System.out.print(names + " ");
            }
            System.out.println();
        }
        System.out.println(vararray(1,2,3,4));
        System.out.println(vararray(5,6,4));

        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(1);
        Numbers.add(12);
        Numbers.add(123);

        System.out.println("Enter the # you want to enter: ");
        int numOfInput=scanner.nextInt();

        for (int i=0; i<numOfInput;i++){
            System.out.println("Enter the number:");
            int newNumber=scanner.nextInt();
            Numbers.add(newNumber);
        }

        Numbers.remove(1);
        Collections.sort(Numbers);
        System.out.println(Numbers);
        scanner.close();
    }
    static int vararray(int... numbers){
        int sum = 0;
        for(int num: numbers){
            sum+=num;
        }
        return sum;
    }
}
