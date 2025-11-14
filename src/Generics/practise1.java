package Generics;

public class practise1<T> {

        // create a generics method
        public void display(T data) {

            System.out.println("Data: " + data);
        }

        public static void main(String[] args) {
            practise1 obj = new practise1();

            // generics method working with String
            obj.<String>display("Java");

            // generics method working with integer
            obj.<Integer>display(25);
        }
}
