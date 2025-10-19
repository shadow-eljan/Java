package overloadMethods;

public class variableScope {

    static int x =3; //CLASS VARIABLE

    public static void main(String[] args) {

        int x =1; //LOCAL
        random();



    }
    static void random(){
        int x = 2; // LOCAL
        System.out.println(x);
    }
}
