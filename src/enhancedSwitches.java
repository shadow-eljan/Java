import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {

        String day;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a day: ");
        day = scanner.nextLine();

        switch(day){
            case "Monday" -> System.out.println("Today is Monday.");
            case "Tuesday" -> System.out.println("Today is Tuesday");
            case "Wednesday" -> System.out.println("Today is Wednesday");
            case "Thursday" -> System.out.println("Today is Thursday");
            case "Friday" -> System.out.println("Today is Fridayday");
            case "Saturday" -> System.out.println("Today is Saturday");
            case "Sunday" -> System.out.println("Today is Sunday");
            default -> System.out.println("No such day found. 🤣🤣");
        }
    }
}
