package Practise;

import java.util.Scanner;

public class practiseOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean isSuccessfull = false;

        while(!isSuccessfull){

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if(name.length() < 4 || name.length() > 12){
                System.out.println("Name must be between 1 to 12 characters.");

            } else if (name.contains(" ") || name.contains("_") || name.contains("-")) {
                System.out.println("Can't include -,_, or space in name.");

            }else{
                System.out.println("Name created successfully.");
                isSuccessfull = true;
            }
        }

    }
    }

