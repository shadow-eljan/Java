package Projects;

import java.util.Scanner;

public class compoundInterestCalculator {
    public static void main(String[] args) {

        //CI CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter Principle: ");
        principle = scanner.nextDouble();

        System.out.println("Enter rate: ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the number of times compounded (yearly / semi-annually / quarterly): ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The total amount is $%,.2f" ,amount );


        scanner.close();
    }
}
