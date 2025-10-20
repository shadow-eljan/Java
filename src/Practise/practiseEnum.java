package Practise;

import java.util.Scanner;

public class practiseEnum {
    void speak(){
        System.out.println("I Speak.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week.");
        String dayName = scanner.nextLine().toUpperCase();

        switch (dayName){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("Its a working day.");
            case "SATURDAY", "SUNDAY" -> System.out.println("Its a happy holiday.");
        }
    }
}
