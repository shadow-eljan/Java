package loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(!name.equalsIgnoreCase("Q")){
            System.out.print("\nEnter a specific(Secret) letter to quit: ");
            name = scanner.nextLine();
            if(!name.equalsIgnoreCase("Q")){
                System.out.println("You failed 🤣🤣🤣");
            }else{
                System.out.println("\nYou have escaped successfully 😊😊");
            }
        }

        int age = 0;

        System.out.print("\nEnter your age: ");
        age = scanner.nextInt();

        while(age <= 0){
            System.out.println("Invalid age.");
            System.out.print("\nEnter new age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are "+ age + " years old.");
    }
}
