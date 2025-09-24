package Condition;

import java.util.Scanner;

public class if_Condition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Are you an Student? (True / False): ");
        isStudent = sc.nextBoolean();

        //CONDITION 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name.😒");
        }else{
            System.out.println("\nHello " + name + "😊");
        }

        //CONDITION 2
        if (age>=100){
            System.out.println("You are an amazing person.👴👵");
        }else if (age <= 0){
            System.out.println("You are not born yet *_*🐣");
        }else if(age >=18){
            System.out.println("You are an adult");
        }else{
            System.out.println("Default T_T");
        }

        //CONDITION 3

        if(isStudent){
            System.out.println("Welcome (" + name + ") to TechSpire College.");
        }else{
            System.out.println("You are not an student.🥹");
        }
        sc.close();
    }
}
