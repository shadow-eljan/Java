package Practise;

import java.util.Scanner;

public class practiseThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input ="";


        while(!input.equalsIgnoreCase("e")){
            System.out.print("Enter a secret alphabet to exit: ");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("e")){
                System.out.println("You have escaped. ");
            }else{
                System.out.println("Try Again.");
            }

        }
    }
}
