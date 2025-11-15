package Recursion;

public class conditionalRecursion {
    public static void printNumbers(int n) {

        // Base case to terminate recursion
        if (n == 3) {
            return;
        }

        // Execute code if base case is not met
        System.out.println(n);

        // Recursive call with increment
        printNumbers(n + 1);
    }

    public static void main(String[] args) {
        printNumbers(1);
    }
}
