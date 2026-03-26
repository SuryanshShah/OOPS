import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {

        // Creating SortedMap
        SortedMap<Integer, String> map = new TreeMap<>();

        // Insertion
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        System.out.println("After Insertion: " + map);

        // Deletion
        map.remove(2);
        System.out.println("After Deletion: " + map);

        // Updation
        map.put(1, "Updated A");
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

        if (map.containsValue("C")) {
            System.out.println("Value C found!");
        } else {
            System.out.println("Value C not found!");
        }
    }
}