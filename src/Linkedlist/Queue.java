package Linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {

    //POLL = REMOVE 1ST INDEX DATA
    // OFFER = ADD IN THE BACK

    public static void main(String[] args) {


        LinkedList<Integer> numbers = new LinkedList<>();

        // add elements to numberList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Original numbers : "+ numbers);
        // remove element from the front
        numbers.poll();

        System.out.println("After POLL: " + numbers);

        // take an integer input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // add the user input to the end of numberList
        numbers.offer(number);


        // print numbersList
        System.out.println("After OFFER: " + numbers);

        input.close();
    }
}
