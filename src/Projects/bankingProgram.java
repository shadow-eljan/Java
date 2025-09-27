package Projects;

import java.util.Scanner;

public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //SIMPLE BANKING SYSTEM



        double balance = 0;
        boolean isRunning=true;
        int choice;

        while(isRunning){
            System.out.println("********************************");
            System.out.println("BANKING SYSTEM");
            System.out.println("1. Show Balance.");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit(balance);
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice.");
            }
        }
        System.out.println("Thank You for Banking with US.");

        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Your total balance is: $%,.2f\n", balance);
    }
    static double deposit(double balance){
        double amount;


        System.out.print("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();

        double result = balance + amount;

        if(amount > 0){
            System.out.println("Your new balance is: "+ result);
            return amount;
        }else{
            System.out.println("Can't deposit negative amount. 😒😒");
            return 0;
        }
    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter the amount you want to withdraw: ");
        amount = scanner.nextDouble();
        if (amount > balance){
            System.out.println("Insufficient Balance.");
            return 0;
        }else if (amount < 0){
            System.out.println("Amount can't be less than 0.");
            return 0;
        }else{
            System.out.println("Successful withdraw of amount $"+amount);
            return amount;
        }
    }
}
