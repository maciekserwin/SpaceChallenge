import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();

        // Load items for Phase-1 and Phase-2
        ArrayList<Item> phase1Items = simulation.loadItems("phase-1.txt");
        ArrayList<Item> phase2Items = simulation.loadItems("phase-2.txt");

        // Load fleet of U1 rockets for Phase-1 and Phase-2
        ArrayList<Rocket> u1RocketsPhase1 = simulation.loadRockets(phase1Items, new U1());
        ArrayList<Rocket> u1RocketsPhase2 = simulation.loadRockets(phase2Items, new U1());

    }
}