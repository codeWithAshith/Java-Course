package a.basic;

import java.util.HashMap;
import java.util.Map;

public class G_Map {
    public static void main(String[] args) {
        // map stores values as key value pair
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Code");
        map.put(2, "With");
        map.put(3, "Ashith");

        System.out.println("Key 2 - "+map.get(2)); // returns value
        System.out.println("Key5 - "+map.get(5)); // returns null
        // key should be unique or else it will be overridden
        // hashmap - does not keep its order
        map.put(3, "Arjun");
        System.out.println("Key 3 - "+map.get(3));

    }
}
