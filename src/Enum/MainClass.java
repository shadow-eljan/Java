package Enum;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        //ENUM = (Enumeration) A special kind of class that
        // represents a fixed set of constants
        // Improves code readability and easy to maintain
        // More efficient with switches when comparing Strings


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("This is a weekday.");
                case SATURDAY,
                     SUNDAY-> System.out.println("It is a weekend.");
            }
        }catch(Exception e){
            System.out.println("Enter a valid day.");
        }
        scanner.close();
    }
}
