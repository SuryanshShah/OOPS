import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        // Creating Map
        Map<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        System.out.println("After Insertion: " + map);

        // Deletion
        map.remove(2);
        System.out.println("After Deletion: " + map);

        // Updation (update value using same key)
        map.put(1, "Grapes");
        System.out.println("After Updation: " + map);

        // Traversal
        System.out.println("Traversal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Searching
        if (map.containsKey(3)) {
            System.out.println("Key 3 found!");
        } else {
            System.out.println("Key 3 not found!");
        }

        if (map.containsValue("Mango")) {
            System.out.println("Value Mango found!");
        } else {
            System.out.println("Value Mango not found!");
        }
    }
}