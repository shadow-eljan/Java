package Projects;

import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    static  Random random = new Random();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain = "y";

        System.out.println("Welcome to Slot Machine");
        System.out.println("Symbols: 🍇 🍈 🍉 🍌 🍍 🍎");

        while(balance > 0){
            while(playAgain.equalsIgnoreCase("y")){
                System.out.println("\nyour current balance is: $"+balance);
                System.out.print("Place your bet amount: ");
                bet = scanner.nextInt();
                scanner.nextLine();

                if(bet > balance){
                    System.out.println("\nInsufficient Funds.");
                    break;
                }else if(bet <= 0){
                    System.out.println("\nBet must be greater than Zero");
                    continue;
                }else{
                    balance -=bet;
                    System.out.println("\nYour current balance is : $" + balance);
                }
                System.out.println("Spinning .........");
                row = spinRow();
                printRow(row);
                payout = getPayout(row, bet);

                if(payout > 0){
                    System.out.println("\nYou won $"+ payout);
                    balance += payout;
                }else{
                    System.out.println("\nYOU LOST.");
                }
                System.out.print("\nDo you want to play again? (y / n): " );
                playAgain = scanner.nextLine();

                }
            if(!playAgain.equalsIgnoreCase("y")){
                break;
            }
        }
        System.out.println("\nGame Over.");
        System.out.println("Your final balance is: "+ balance);
        scanner.close();
    }
    static String[] spinRow(){

        String[] symbols = {"🍇", "🍈", "🍉", "🍌", "🍍", "🍎"};
        String[] row = new String[3];

        for(int i=0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];

        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("\n💫💫💫💫💫💫💫💫💫💫");
        System.out.println(" "+ String.join(" | ", row));
        System.out.println("💫💫💫💫💫💫💫💫💫💫");
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) &&  row[1].equals(row[2])){
            return switch(row[1]){
                case "🍇" -> bet * 3;
                case "🍈" -> bet * 4;
                case "🍉" -> bet * 5;
                case "🍌" -> bet * 6;
                case "🍍" -> bet * 8;
                case "🍎" -> bet * 10;
                default -> 0;

            };
        } else if (row[0].equals(row[1]) || row[0].equals(row[2]) || row[1].equals(row[2])) {
            return switch(row[0]) {
                case "🍇", "🍈" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍌" -> bet * 4;
                case "🍍" -> bet * 5;
                case "🍎" -> bet * 6;
                default -> 0;
            };
        }

        return 0;
    }
}
