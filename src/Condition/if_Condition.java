package Condition;

public class if_Condition {
    public static void main(String[] args) {
        int age = 10;

        if (age>18){
            System.out.println("You are an adult.");
        }else if (age <= 0){
            System.out.println("You are not born yet *_*");
        }else if(age >=100){
            System.out.println("You are an amazing person.");
        }else{
            System.out.println("T_T");
        }
    }
}
