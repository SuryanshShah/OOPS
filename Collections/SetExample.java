import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        // Insertion
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        System.out.println("After Insertion: " + set);

        // Deletion
        set.remove("Banana");
        System.out.println("After Deletion: " + set);

        // Updation
        set.remove("Apple");
        set.add("Grapes");
        System.out.println("After Updation: " + set);

        // Traversal
        System.out.println("Traversal:");
        for(String item : set) {
            System.out.println(item);
        }

        // Searching
        if(set.contains("Mango")) {
            System.out.println("Mango found!");
        }
    }
}