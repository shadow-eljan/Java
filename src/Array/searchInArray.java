package Array;

import java.util.Scanner;

public class searchInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] fruits = {"mango", "apple", "banana"};
        String target;
        int searchNum;
        boolean isFound = false;


        System.out.print("Enter a number to search: ");
        searchNum = scanner.nextInt();
        scanner.nextLine();


        for (int num : numbers) {
            if (searchNum == num) {
                System.out.println("Found " + num);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Not Found.");
        }


        System.out.print("Enter a fruit to search: ");
        target = scanner.nextLine();

        for (String food : fruits) {
            if (food.equals(target)) {
                System.out.println("Found " + food);
                isFound = true;
                break;
            }else{
                isFound = false;
            }
        }
        if (!isFound) {
            System.out.println("Not Found.");
        }

        scanner.close();
    }
}