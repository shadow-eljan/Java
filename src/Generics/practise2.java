package Generics;

import java.util.Scanner;

public class practise2<T> {

    // create a generics method and pass T data to it
    public  void display(T data) {

        // print data
        System.out.println(data);
    }

    public static void main(String[] args) {

        // create object of Main class
        practise2 obj = new practise2();

        Scanner input = new Scanner(System.in);

        // take String input from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // take double input from the user
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // call display method and pass text
        obj.<String>display(text);

        // call display method and pass number
        obj.<Double>display(number);

        input.close();
    }
}
