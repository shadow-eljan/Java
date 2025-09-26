package Projects;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input1;
        double input2;
        int choice;

        System.out.println("SIMPLE CALCULATOR");
        System.out.println("\nChoose from the following option:");
        System.out.println("1. SUM");
        System.out.println("2. SUBTRACT");
        System.out.println("3. DIVISION");
        System.out.println("4. MULTIPLICATION");
        System.out.print("\nEnter your choice (1 to 4): ");
        choice = scanner.nextInt();

        System.out.print("\nEnter 1st number: ");
        input1 = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        input2 = scanner.nextDouble();



        switch(choice){
            case 1 -> System.out.printf("Sum of two numbers: %.2f" , input1 + input2);
            case 2 -> System.out.printf("Subtraction of two numbers: %.2f" , input1 - input2);
            case 3 -> System.out.printf("Division of two numbers: %.2f", input1 / input2);
            case 4 -> System.out.printf("Multiplication of two numbers: %.2f" , input1 * input2);
            default -> System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
