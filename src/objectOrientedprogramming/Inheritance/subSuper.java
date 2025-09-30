package objectOrientedprogramming.Inheritance;

public class subSuper extends subClass{


    double power;

    subSuper(String first, String last, double pow){
        super(first, last);
        this.power = pow;
    }

    void showgpa(){
        System.out.println(this.first + " is from Greatest Estate Developer.");
        System.out.println("I forgot his last name, so " + this.last);
        System.out.printf("His power is over %,.2f" , this.power);
    }
}
