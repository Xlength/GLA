package Mock_Exam.Java.MockJava;

import java.util.*;

/**
 * Example of sorting objects using a custom comparator.
 */
public class SortingExample {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("A", 10));
        items.add(new Item("B", 5));
        items.add(new Item("C", 15));

        // Sort by value (ascending)
        items.sort(Comparator.comparingInt(Item::getValue));
        System.out.println("Sorted by value: " + items);

        // Sort by value (descending)
        items.sort(Comparator.comparingInt(Item::getValue).reversed());
        System.out.println("Sorted by value (desc): " + items);
    }

    static class Item {
        private final String name;
        private final int value;

        public Item(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return name + " (" + value + ")";
        }
    }
}
