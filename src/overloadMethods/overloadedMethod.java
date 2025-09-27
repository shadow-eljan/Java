package overloadMethods;

public class overloadedMethod {
    public static void main(String[] args) {

        //overloaded methods = same name different parameters
        System.out.println(add(1,2, 6));
        String pizza = bakePizza("flat bread", "Mozzarella");
        System.out.println(pizza);

    }
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
}
