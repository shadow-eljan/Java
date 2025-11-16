package Recursion;

import java.util.Scanner;

public class decimalToBinary {
    public static String findBinary(int decimal) {

        if (decimal == 0) {
            return "";
        }

        // Recursively divide decimal by 2
        // And concatenate remainder to the result
        return findBinary(decimal / 2) + Integer.toString(decimal % 2);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String binaryRepresentation = findBinary(num);
        System.out.println(binaryRepresentation);
    }
}
