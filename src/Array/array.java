package Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        //ARRAY = COLLECTION OF VALUES OF SAME DATA TYPE

        String[] fruits = {"apple", "banana", "orange", "coconut"};

        fruits[0] = "pineapple";
        int num = fruits.length;
        System.out.println(fruits[0]);
        System.out.println(num);

//        for(int i =0; i<num; i++){
//            System.out.println(fruits[i]);
//        }

        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
