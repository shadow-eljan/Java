package Scanner;

import java.util.Scanner;

public class usingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine(); //Declaration + Assignment//

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your favourite food: ");
        String food = sc.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = sc.nextDouble();

        System.out.println("Are you a Student? (True/False)" );
        boolean isStudent = sc.nextBoolean();

        System.out.println("Hello "+ name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favourite food is " + food);
        System.out.println("Your GPA is " + gpa);

        if(isStudent){
            System.out.println("You are enrolled to TechSpire College.");
        }else{
            System.out.println("You are not enrolled.");
        }

        sc.close();
    }
}
