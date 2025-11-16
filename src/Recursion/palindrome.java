package Recursion;

import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String text){

        if(text.isEmpty() || text.length() == 1){
            return true;
        }

        if(text.charAt(0) == text.charAt(text.length()-1)){
            return isPalindrome(text.substring(1, text.length() - 1));
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = scanner.nextLine();

        boolean checkPalindrome = isPalindrome(text);

        if(checkPalindrome){
            System.out.println(text + " is a Palindrome.");
        }else{
            System.out.println(text + " is not a Palindrome.");
        }
    }
}
