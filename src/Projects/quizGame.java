package Projects;

import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

        //QUIZ GAME

        Scanner scanner = new Scanner(System.in);

        String[] questions ={"1. What is a computer?",
                "2. Which part of a computer is the brain?",
                "3. Who is knows as the Father of Computer?",
                "4. Which was the 1st programming language?",
                "5. Who was the 1st programmer?"};

        String[][] options={{"1. food","2. gadget", "3. Electronic Machine", "4. Metal box"},
                {"1. RAM", "2. CPU", "3. Memory", "4. Battery"},
                {"1. Eljan", "2. Subash", "3. Sumit", "4. Charles Babbage"},
                {"1. Java", "2. C++", "3. Python", "4. Fortran"},
                {"1. Eljan", "2. Subash", "3. Sumit", "4. lady Augusta Ada Lovelace" }
        };

        int[] answers={3, 2, 4, 4, 4};
        int score =0;
        int guess;

        System.out.println("*************************");
        System.out.println("WELCOME TO QUIZ GAME");
        System.out.println("**************************");

        for(int i = 0; i<questions.length; i++){
            System.out.println("\n"+ questions[i]);

            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("\n🎉🎉🎉🎉🎉🎉🎉");
                System.out.println("You are Correct. 😊😊😊");
                System.out.println("🎉🎉🎉🎉🎉🎉🎉");
                score += 1;
            }else{
                System.out.println("\n❎❎❎❎❎❎❎");
                System.out.println("You are Wrong.");
                System.out.println("❎❎❎❎❎❎❎");
            }
        }
        System.out.println("\nYour total score is: "+ score);
        scanner.close();
    }
}
