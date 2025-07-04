//Hashmap = a data structure that stores key value pairs 
//It does not  maintain the order of elements but is memory efficient

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<String, Double>();


        map.put("apple", 0.50);
        map.put("banana", 0.30);
        map.put("orange", 0.60);

        System.out.println(map); 
    }
}