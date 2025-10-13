package LearningExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Exception = An event that interrupts the normal flow of a program
        //(Divide by zero, file not found, mismatch input type, etc)
        // Surround any dangerous code with try{} block
        // try{, catch{}, finally{}
//
//        try{
//            System.out.println(1 / 0);
//        }catch(ArithmeticException e){
//
//            System.out.println("You can't divide by zero.");
//        }finally{
//            System.out.println("It runs anyway.");
//        }



        try {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("You should enter a proper number");
        } catch (Exception a) {
            // Safety Net
            System.out.println("Something went wrong.");

        } finally {
            System.out.println("This always runs.");
        }
        scanner.close();
    }
}
