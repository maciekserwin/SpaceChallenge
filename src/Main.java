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

        // Run simulation using U1 rockets and display total budget
        int totalBudgetU1Phase1 = simulation.runSimulation(u1RocketsPhase1);
        int totalBudgetU1Phase2 = simulation.runSimulation(u1RocketsPhase2);
        int totalBudgetU1 = totalBudgetU1Phase1 + totalBudgetU1Phase2;

        System.out.println("Total budget required for U1 rockets:");
        System.out.println("Phase 1: $" + totalBudgetU1Phase1 + " million");
        System.out.println("Phase 2: $" + totalBudgetU1Phase2 + " million");
        System.out.println("Total: $" + totalBudgetU1 + " million");

        // Load fleet of U2 rockets for Phase-1 and Phase-2
        ArrayList<Rocket> u2RocketsPhase1 = simulation.loadRockets(phase1Items, new U2());
        ArrayList<Rocket> u2RocketsPhase2 = simulation.loadRockets(phase2Items, new U2());

        // Run simulation using U2 rockets and display total budget
        int totalBudgetU2Phase1 = simulation.runSimulation(u2RocketsPhase1);
        int totalBudgetU2Phase2 = simulation.runSimulation(u2RocketsPhase2);
        int totalBudgetU2 = totalBudgetU2Phase1 + totalBudgetU2Phase2;

        System.out.println("Total budget required for U2 rockets:");
        System.out.println("Phase 1: $" + totalBudgetU2Phase1 + " million");
        System.out.println("Phase 2: $" + totalBudgetU2Phase2 + " million");
        System.out.println("Total: $" + totalBudgetU2 + " million");

    }
}