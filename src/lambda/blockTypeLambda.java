package lambda;

public class blockTypeLambda {
    public static void main(String[] args) {

        //IT CONTAINS A BLOCK OF CODE IN {} BRACKET

        sample s = (x, y) -> {


            int sum = x + y;
            System.out.println("The sum is: " + sum);
        };

        s.example(3, 5);
    }
}
