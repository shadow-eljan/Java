package Practise;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class rockPaperScissor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String computerInput = computerChoice();
        System.out.println("💫💫Welcome to Rock Paper Scissor Game 💫💫");

        System.out.print("Enter your choice: ");
        String userInput=scanner.nextLine().toLowerCase();


        if (!(userInput.contains("rock")) && !(userInput.contains("paper")) && !(userInput.contains("scissor"))){
            System.out.println("Invalid Choice");
            System.exit(0);
        }

        String result = Result(computerInput, userInput);

        System.out.println("\nYour pick: "+ userInput);
        System.out.println("Computer Pick: "+computerInput);
        System.out.println("\n"+result);


    }
    static String computerChoice(){
        Random random = new Random();
        int randomNumber = random.nextInt(1,4);
        String choice="";

        return switch(randomNumber){
            case 1 -> "rock";
            case 2 ->  "paper";
            case 3 -> "scissor";
            default -> "Invalid";
        };
    }
    static String Result(String computerInput, String userInput) {


        if (userInput.equals(computerInput)) {
            return "It's a tie!";
        }
        else if (
                (userInput.equals("rock") && computerInput.equals("scissor")) ||
                        (userInput.equals("paper") && computerInput.equals("rock")) ||
                        (userInput.equals("scissor") && computerInput.equals("paper"))
        ) {
            return "You win! 🎉";
        }
        else {
            return "Computer wins! 💻";
        }
    }
}

