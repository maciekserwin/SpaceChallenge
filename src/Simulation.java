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

    private ArrayList<Rocket> loadRockets(ArrayList<Item> items, Rocket rocketType) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = rocketType;

        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = rocketType;
                rocket.carry(item);
            }
        }
        rockets.add(rocket);
        return rockets;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        int totalBudget = 0;
        for (Rocket rocket : rockets) {
            totalBudget += rocket.getRocketCost();
            while (!rocket.launch() || !rocket.land()) {
                totalBudget += rocket.getRocketCost();
            }
        }
        return totalBudget;
    }
}



