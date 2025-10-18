package Practise;

import java.util.Scanner;

public class practiseTwo {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        boolean isStudent;
        boolean isSenior;

        System.out.print("Are you a Student: ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a Senior Citizen: ");
        isSenior = scanner.nextBoolean();

        if(isStudent){
            if(isSenior){
                System.out.println("You get 40% Discount.");
            }else{
                System.out.println("You get 10% Discount.");
            }
        }else {
            if(isSenior){
                System.out.println("You get 20% Discount.");
            }else {
                System.out.println("You get NO Discount.");
            }
        }

    }
}
