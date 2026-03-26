import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        // Insertion
        set.add(30);
        set.add(10);
        set.add(20);
        System.out.println("After Insertion: " + set);

        // Deletion
        set.remove(10);
        System.out.println("After Deletion: " + set);

        // Updation
        set.remove(20);
        set.add(25);
        System.out.println("After Updation: " + set);

        // Traversal
        System.out.println("Traversal:");
        for (int num : set) {
            System.out.println(num);
        }

        // Searching
        if (set.contains(25)) {
            System.out.println("25 found!");
        } else {
            System.out.println("25 not found!");
        }
    }
}