import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of items
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create ArrayList
        ArrayList<String> items = new ArrayList<>();

        // Read items
        String[] inputItems = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            items.add(inputItems[i]);
        }

        // Read search item
        String searchItem = sc.nextLine();

        // Sort items alphabetically
        Collections.sort(items);

        // Print sorted list
        System.out.println("Sorted Items: " + items);

        // Check if item exists
        if (items.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}