package HashMap;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {

        //HashMap = A data structure that stores key value pairs
        // Keys are unique, but values can be duplicated
        // Does not maintain any order, but is memory efficient
        // HashMap (Key, Value)

        HashMap<String, Double> map = new HashMap<String, Double>();
        map.put("Apple", 100.00);
        map.put("Banana", 20.00);
        map.put("Watermelon", 200.00);
        map.put("Coconut", 250.00);

//        map.remove("Coconut");
//        System.out.println(map.containsKey("Watermelon"));
//        System.out.println(map.containsValue(20.00));
//        System.out.println(map.size());

//        if(map.containsKey("Apple")){
//            System.out.println(map.get("Apple"));
//        }else{
//            System.out.println("Not Found");
//        }

        for(String key: map.keySet()){
            System.out.println(key + " : $"+ map.get(key));
        }

    }
}
