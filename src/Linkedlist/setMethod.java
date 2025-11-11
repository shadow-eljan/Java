package Linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class setMethod {
    public static void main(String[] args) {

        // create an LinkedList of String called names
        LinkedList<String> names = new LinkedList<>();

        // add Jeremy, Jules & Howard
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");

        System.out.println(names);

        // take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Add something: ");
        String name1 = input.nextLine();

        // replace the value in index 1 with name1
        names.set(1, name1);

        // print names
        System.out.println(names);

        input.close();
    }
}
