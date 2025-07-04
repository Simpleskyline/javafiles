//Hashmap = a data structure that stores key value pairs 
//It does not  maintain the order of elements but is memory efficient

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();


        map.put("apple", 0.50);
        map.put("banana", 0.30);
        map.put("orange", 0.60);
        map.put("grape", 0.80);

        //map.remove("apple"); // Remove the key "apple"

        
        //System.out.println(map.get("apple")); // Retrieve the value associated with the key "apple" 

        System.out.println(map.containsKey("banana")); // Check if the key "banana" exists in the map
    }
}