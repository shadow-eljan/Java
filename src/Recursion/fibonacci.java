package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fib(int n) {

        // Base Case
        // If number is 1 or 0, return it
        if (n == 1 || n == 0) {
            return n;
        }

        // Return sum of previous two Fibonacci numbers
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int result = fib(4);
        System.out.println(result);
    }
}
