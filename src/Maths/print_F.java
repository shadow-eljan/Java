package Maths;

public class print_F {
    public static void main(String[] args) {

        //PRINTF
        // %[flags][width][.precision][specifier-character]
        //PRECISION %.[NUMBER]f
        // + = + sign in output
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        String name = "Spider man";
        char letter = 'A';
        double height = 60.999;
        int age = 19;
        boolean isEmployed = false;

        System.out.printf("Hello %s" ,name);
        System.out.printf("\nLetter: %c" , letter);
        System.out.printf("\nHeight: %f" , height);
        System.out.printf("\nYou are %d years old" ,age);
        System.out.printf("\nAre you employed? %b\n", isEmployed);

        double price1 = 9.99;
        double price2 = 100000.123;
        double price3 = -50.55;
        double price4 = -100000.666666666;
        double price5 = -12345.12345;


        System.out.printf("\n%+.1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%.3f\n", price3);
        System.out.printf("%(.4f\n", price4);
        System.out.printf("% .5f\n", price5);
        System.out.printf("%(.4f\n", price1);
        System.out.printf("% .5f\n", price2);

        int a=1;
        int b=11;
        int c = 111;
        int d = 1111;

        // 0 = zero padding
        // +ve number = right justify
        // -ve number = left justify

        System.out.printf("\n%04d\n", a);
        System.out.printf("%04d\n", b);
        System.out.printf("%04d\n", c);
        System.out.printf("%04d\n", d);

        System.out.printf("\n%4d\n", a);
        System.out.printf("%4d\n", b);
        System.out.printf("%4d\n", c);
        System.out.printf("%4d\n", d);

        System.out.printf("\n%-4d\n", a);
        System.out.printf("%-4d\n", b);
        System.out.printf("%-4d\n", c);
        System.out.printf("%-4d\n", d);

    }
}
