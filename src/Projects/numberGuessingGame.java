package Projects;

import java.util.Scanner;
import java.util.Random;
public class numberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // NUMBER GUESSING GAME

        int guess;
        int randomNumber = random.nextInt(1, 11);

        System.out.println("WELCOME TO NUMBER GUESSING GAME 😊😊😊");
        System.out.println("Guess a number between 1 to 10");

        do{
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();
            if(guess<randomNumber){
                System.out.println("Too Low");
            }else if(guess>randomNumber){
                System.out.println("Too High");
            }else{
                System.out.println("You WON");
            }
        }while(guess != randomNumber);

    }
}
