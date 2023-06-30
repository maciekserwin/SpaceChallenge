import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    private ArrayList<Item> loadItems(String fileName) {
        ArrayList<Item> items = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("=");
                String name = parts[0];
                int weight = Integer.parseInt(parts[1]);
                Item item = new Item(name, weight);
                items.add(item);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        return items;
    }
}


