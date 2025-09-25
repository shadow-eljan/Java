package stringMethods;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {

        //.substring = a method used to extract a portion of a string
        // string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;

        System.out.print("Enter your gmail: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);

            System.out.println("Username: "+ username);
            System.out.println("Domain: " + domain);
        }else{
            System.out.println("Email must contain @ char.");
        }
        scanner.close();

    }
}
