package Operators;

import java.util.Scanner;

public class validateUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // username must be between 4 - 12 characters
        // username must not contain space

        System.out.print("Enter your Username. (Must be 4-12 char and not contain space): ");
        String username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters.");
        }else if(username.contains(" ") || username.contains("_") || username.contains("-")){
            System.out.println("Username must not contain space or _ or -");
        }else{
            System.out.println("Username created Successfully.");
        }

        scanner.close();
    }
}
