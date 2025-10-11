package objectOrientedprogramming;

public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper classes = Allow primitive values (int, char, double,
        // boolean) to be used as objects.
        //Allows use of Collections Framework and Static Utility Methods


//        Integer a = new Integer(123);
//        Double b = new Double(3.14);
//        Character c = new Character("$");
//        Boolean d = new Boolean(true);
//        String e = new String("Apple");

        //Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "Apple";

        //Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean i = d;

        //Convert to String
        String k = Integer.toString(123);
        String l = Double.toString(3.14);
        String m= Character.toString('@');
        String n = Boolean.toString(false);

        //String to Primitive
        int o = Integer.parseInt("123");
        double p = Double.parseDouble("3.14");
        char q = "Pizza".charAt(0);
        boolean r = Boolean.parseBoolean("true");


        char letter = 'p';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
