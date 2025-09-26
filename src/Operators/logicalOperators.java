package Operators;

public class logicalOperators {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        //! = NOT

        double temp = 50;
        boolean isSunny = false;

        if(temp <= 30 && isSunny){
            System.out.println("Good temperature today.");
            System.out.println("It is Sunny Today.");
        }else if (temp < 10 && !isSunny){
            System.out.println("It's not Sunny Today.");
            System.out.println("It's cold.");
        }else if ( temp > 30 && isSunny){
            System.out.println("Very hot day.");
        }else{
            System.out.println("Normal Day.");
        }
    }
}
