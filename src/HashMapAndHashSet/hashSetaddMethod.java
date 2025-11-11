package HashMapAndHashSet;

import java.util.HashSet;

public class hashSetaddMethod {

//    Union of Sets == addAll();
//    Intersection of Sets
//    Difference of Sets

    public static void main(String[] args) {

        // create a HashSet of Integer type
        HashSet<Integer> numbers = new HashSet<>();

        // add elements 2 and 3 to numSet
        numbers.add(2);
        numbers.add(3);

        // again add 2 to numSet again
        numbers.add(2);

        // print numSet
        System.out.println(numbers);
    }
}
