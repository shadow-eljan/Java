package Maths;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        //HYPOTENUSE

        Scanner scanner = new Scanner(System.in);

        double h;
        double p;
        double b;


        System.out.println("Enter perpendicular: ");
        p = scanner.nextDouble();

        System.out.println("Enter base: ");
        b= scanner.nextDouble();

        h = Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2));

        System.out.println("Hypotenuse is: " + h);

        System.out.println();
        scanner.close();

    }
}
