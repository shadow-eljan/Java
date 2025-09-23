package Variables;

public class primitivevariable {

    public static void main(String[] args) {
        int age=20; //declaration variable//
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println("The year is: " + year);
        System.out.println(quantity + " Apple was bought");

        double price = 99.99;
        double gpa = 3.80;
        double temperature = -29.50;
        double test = 9;

        System.out.println("int is converted to double " + test);
        System.out.println(temperature + " is very cold");

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("My grade is " + grade);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        if(isStudent){
            System.out.println("Welcome to TechSpire College.");
        }else{
            System.out.println("Your are not a student.");
        }

        if(forSale){
            System.out.println("There is " + quantity + " car for sale.");
        }else{
            System.out.println("No car available for sale.");
        }
    }
}
