package loops;

import java.util.Scanner;

public class countDown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start;


        System.out.print("Enter which number you want to start countdown from: ");
        start = scanner.nextInt();

        for(int i = start; i>0; i--){
            System.out.println(i);
        }
        System.out.println("HAPPY NEW YEAR!!");
    }
}
