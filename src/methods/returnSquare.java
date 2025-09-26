package methods;

public class returnSquare {
    public static void main(String[] args) {

        System.out.println(Square(9));
        System.out.println(cube(3));

        String fullName = FullName("Eljan", "Rai");
        System.out.println(fullName);

        int age = 18;

        if(ageCheck(age)){
            System.out.println("You are eligible.");
        }else{
            System.out.println("Must be 18+ to be eligible.");
        }

    }
    static double Square(double square){
        return square * square;
    }
    static int cube(int number){
        return number * number * number;
    }
    static String FullName(String firstname, String lastname){
       return firstname + " " + lastname;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
