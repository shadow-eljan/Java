package HashMapAndHashSet;

import java.util.HashSet;

public class Intersection {

    //INTERSECTION = retainALL();

    public static void main(String[] args) {

        // create a HashSet
        HashSet<Integer> num1 = new HashSet<>();

        // add elements to numSetOne
        num1.add(2);
        num1.add(3);
        num1.add(4);

        // create another HashSet
        HashSet<Integer> num2 = new HashSet<>();

        // add elements to numSetTwo
        num2.add(3);
        num2.add(4);
        num2.add(5);

        // find intersection
        num1.retainAll(num2);

        // print numSetOne
        System.out.println(num1);
    }

}
