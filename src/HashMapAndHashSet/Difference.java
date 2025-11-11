package HashMapAndHashSet;

import java.util.HashSet;

public class Difference {

    //DIFFERENCE OF SET = removeAll();

    public static void main(String[] args) {

        // create a HashSet
        HashSet<Integer> num1 = new HashSet<>();

        // add elements to numSetOne
        num1.add(2);
        num1.add(3);
        num1.add(4);

        // create a HashSet
        HashSet<Integer> num2 = new HashSet<>();

        // add elements to numSetTwo
        num2.add(3);
        num2.add(4);
        num2.add(5);

        // find difference of sets
        num1.removeAll(num2);

        // print numSetOne
        System.out.println(num1);
    }
}
