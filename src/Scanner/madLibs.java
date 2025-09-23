package Scanner;

import java.util.Scanner;
public class madLibs {
    public static void main(String[] args) {

        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1; //Suspicious
        String noun1; //Gorilla
        String adjective2; //Smelly
        String verb1; //Screaming
        String adjective3; //Happy

        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb (word with -ing): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + " Restaurant.");
        System.out.println("In the Restaurant, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + ".");
        System.out.println("And it was " + verb1 + ".");
        System.out.println("It was very funny and I was " + adjective3 + ".");

        scanner.close();
    }
}
