package ternaryOperator;

public class ternary {
    public static void main(String[] args) {

        int score = 70;
        int hours = 15;
        double salary = 50000;

        String passOrFail = (score >= 60)? "PASS" : "FAIL";

        String evenOrOdd = (score % 2 == 0)? "EVEN" : "ODD";

        String time = (hours > 12)? "PM" : "AM";

        double taxRate = (salary <= 50000)? 2 : 5;

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(time);
        System.out.println(taxRate);
    }
}
