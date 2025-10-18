package Practise;

import java.util.Scanner;

public class practiseFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullName;

        System.out.print("Enter your full name: ");
        fullName = scanner.nextLine();

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);


        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);

        String containsA = (firstName.contains("a"))? "It contains A" : "It doesn't contain A.";

        System.out.println(containsA);


    }
}
