package Mock_Exam.Java.MockJava;

/**
 * Factory pattern for creating objects.
 */
public class FactoryExample {

    public static Item createItem(String type) {
        switch (type) {
            case "STANDARD":
                return new Item("Standard", 10);
            case "DELUXE":
                return new Item("Deluxe", 20);
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }

    static class Item {
        private final String name;
        private final int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " (£" + price + ")";
        }
    }

    public static void main(String[] args) {
        Item item = FactoryExample.createItem("STANDARD");
        System.out.println(item);
    }
}
