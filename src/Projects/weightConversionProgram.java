package Projects;

import java.util.Scanner;

public class weightConversionProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("WELCOME TO WEIGHT CONVERSION PROGRAM.");
        System.out.println("\n1. lbs to kgs.");
        System.out.println("2. kgs to lbs.");
        System.out.print("\nEnter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("\nEnter weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("The weight in kgs is: %.2f" , newWeight);
        }else if(choice == 2){
            System.out.println("\nEnter weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("The weight in lbs is: %.2f" , newWeight);
        }else{
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
