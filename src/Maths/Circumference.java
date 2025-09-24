package Maths;

import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {

        //CIRCUMFERENCE OF A CIRCLE
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI*Math.pow(radius, 2);
        volume = (4.0 / 3.0)*Math.PI*Math.pow(radius, 3);

        System.out.printf("\nCircumference is: %.1f" , circumference);
        System.out.printf("\nArea: %.2f" , area);
        System.out.printf("\nVolume: %.3f" , volume);

        scanner.close();
    }
}
