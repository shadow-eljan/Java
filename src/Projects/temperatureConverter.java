package Projects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("TEMPERATURE CONVERTER");
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Farenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        System.out.printf("\nConverted Temperature: %.2f",newTemp);
        scanner.close();
    }
}
