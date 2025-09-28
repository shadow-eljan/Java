package Projects;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {

        //ROCK PAPER SCISSOR GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices ={"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        while(playAgain.equalsIgnoreCase("yes")){

            System.out.print("\nEnter your choice (Rock, Paper, Scissor): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissor")){
                System.out.println("invalid Choice.");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: "+ computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a Draw.");
                System.out.println("🤝🤝🤝🤝🤝");

            }else if(playerChoice.equals("rock") && computerChoice.equals("scissor") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissor") && computerChoice.equals("paper")){

                System.out.println("\nYou Win.");
                System.out.println("🎉🎉🎉🎉");
            }else{
                System.out.println("\nYou Lose.");
                System.out.println("🤣🤣🤣🤣🤣");
            }

            System.out.print("\nDo you want to keep playing? (yes / no): ");
            playAgain = scanner.nextLine();
        }

        System.out.println("\nThank You for Playing My Rock Paper Scissor Game.");
        System.out.println("BYE BYE 👋👋👋👋👋👋");
        scanner.close();
    }
}
