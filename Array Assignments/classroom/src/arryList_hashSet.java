import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class arryList_hashSet {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // add
        list.add(20);
        list.add(1, 15); // insert at index 1

        list.set(0, 5); // update value at index 0
        System.out.println(list);
        System.out.println(list.get(1)); // access
        list.remove(2); // remove index
        list.remove(Integer.valueOf(15)); // remove object

        System.out.println(list.contains(5)); // true
        System.out.println(list.indexOf(5));  // 0
        System.out.println(list.size());      // 1
        System.out.println(list.isEmpty());   // false
        list.clear(); // remove all

        System.out.println(list); // []

//------------ HashMap -------------------------------//

        System.out.println("-------Hashmap---------");

        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);

        // Access a value
        System.out.println(map.get("Bob")); // Output: 30

        // Update a value
        map.put("Alice", 26);

        // Check existence
        System.out.println(map.containsKey("Charlie")); // true
        System.out.println(map.containsValue(30));      // true

        // Remove a key
        map.remove("Bob");

        // Size
        System.out.println(map.size()); // 2

        // Loop through keys and values
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }


//---------- HashSet -------------//

        System.out.println("------------Hashset----------");
        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, won't be added

        // Size
        System.out.println("Size: " + set.size()); // 3

        // Check if value exists
        System.out.println(set.contains(20)); // true
        System.out.println(set.contains(100)); // false

        // Remove value
        set.remove(20);

        // Loop through set
        for (int val : set) {
            System.out.println(val);
        }

        // Clear all elements
        set.clear();

        // Check if empty
        System.out.println("Empty: " + set.isEmpty()); // true
    }
}
