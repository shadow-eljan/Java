package Scanner;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextDouble();

        System.out.println("Enter height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Area of Rectangle is: " + area);

        scanner.close();
    }
}
