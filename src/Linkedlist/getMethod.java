package Linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class getMethod {
    public static void main(String[] args) {


        LinkedList<String> languages = new LinkedList<>();

        // add elements
        languages.add("Java");
        languages.add("Python");

        System.out.println(languages);

        // take an int input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = input.nextInt();

        // access the element at index using get() method
        String element = languages.get(index);

        // print element
        System.out.println(element);

        input.close();
    }
}
