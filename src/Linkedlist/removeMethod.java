package Linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class removeMethod {
    public static void main(String[] args) {

        // create an LinkedList of String called names
        LinkedList<String> movies = new LinkedList<>();

        // take 3 String input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 movie name: ");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();

        // add name1, name2, name3 to names
        movies.add(name1);
        movies.add(name2);
        movies.add(name3);

        // loop through the LinkedList
        for (String name : movies) {

            // print name
            System.out.println(name);
        }
        System.out.println("We removed 2nd movie.");
        movies.remove(1);
        System.out.println(movies);

        input.close();
    }
}
