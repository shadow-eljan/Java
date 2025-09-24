package Projects;
import java.util.Scanner;
public class shoppingCartprogram {
    public static void main(String[] args) {

        //SHOPPING CART PROGRAM

        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency;
        double total;
        System.out.print("What would you like to buy? ");
        item = sc.nextLine();

        System.out.print("What is the price of each? ");
        price = sc.nextDouble();

        System.out.print("How many would you like? ");
        quantity = sc.nextInt();

        total = quantity * price;

        System.out.println("\nYou have bought " + quantity + " " + item );
        System.out.println("Your total price is: " + total );
    sc.close();
    }
}
