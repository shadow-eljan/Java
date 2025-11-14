package lambda;

public class singleLambdaBody {
    public static void main(String[] args) {

        sample s = (x, y) -> System.out.println("This is single line lambda type");

        s.example(1, 2);

    }
}
