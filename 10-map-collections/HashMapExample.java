import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    // Create a HashMap object called inventory
    Map<String, Double> inventory = new HashMap<>();
    inventory.put("Bananas", 2.99);
    inventory.put("Papaya", 5.99);
    inventory.put("Kale", 4.99);
    inventory.put("Apples", 1.99);
    inventory.put("Carrot", 1.49);

    inventory.put("Lime", 0.49);
    inventory.put("Toothpaste", 5.99);
    inventory.put("Zucchini", 5.99);

    System.out.println("\nWelcome to Java Grocers. What can we help you find?:\n");

    System.out.println("\nWhat is the price of Lime?");
    System.out.println(inventory.get("Lime")); // 0.49

    System.out.println("\nWhat is the price of Zucchini?");
    System.out.println(inventory.get("Zucchini")); // 5.99

    System.out.println("\nWhat is the price of Kale?");
    System.out.println(inventory.get("Kale")); // 4.99

    System.out.println("\nDo you guys sell Apples?");
    boolean result = inventory.containsKey("Apples");
    String response = result ? "Yes!" : "No, sorry!";
    System.out.println(response); // Yes!

  }
}
