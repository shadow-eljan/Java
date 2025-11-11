package Linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class deQueue {

//    addFirst() - adds an element at the beginning of the deque
//    addLast() - adds an element at the end of the deque
//    removeFirst() - removes the first element of the deque
//    removeLast() - removes the last element of the deque

    public static void main(String[] args) {

        // create a LinkedList of Character type
        LinkedList<Character> Alphabet = new LinkedList<>();

        // use add() to insert A to alphabets
        Alphabet.add('A');

        System.out.println("Initial data: " + Alphabet);

        // take two input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st char: ");
        char char1 = input.next().charAt(0);

        System.out.println("Enter 2nd char: ");
        char char2 = input.next().charAt(0);

        // use addFirst() to insert char1 at the beginning of alphabets
        Alphabet.addFirst(char1);

        // Use addLast() to insert char2 at the end of alphabets
        Alphabet.addLast(char2);

        // print alphabets
        System.out.println("After adding on front and back: " + Alphabet);

        input.close();
    }

}
