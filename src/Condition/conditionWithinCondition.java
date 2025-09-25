package Condition;

import java.util.Scanner;

public class conditionWithinCondition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price = 10;

        System.out.print("Are you an student? (True / False): ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a Senior? (True / False): ");
        isSenior = scanner.nextBoolean();


        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20% and student discount of 10%.");
                price *= 0.7;
            }else{
                System.out.println("You get a student discount of 10%.");
                price *= 0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%.");
                price *= 0.8;
            }
            price*=1;
        }
        System.out.println("Your final price is: " + price);
        scanner.close();
    }
}
