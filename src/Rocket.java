public class Rocket implements SpaceShip {

   private int rocketCost;
   private int rocketWeight;
   private int maxWeight;
   private double chanceOfLaunchExplosion;
   private double chanceOfLandingCrash;
   private int currentWeight;

    public Rocket(int rocketCost, int rocketWeight, int maxWeight, double chanceOfLaunchExplosion, double chanceOfLandingCrash, int currentWeight) {
        this.rocketCost = rocketCost;
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
        this.chanceOfLaunchExplosion = chanceOfLaunchExplosion;
        this.chanceOfLandingCrash = chanceOfLandingCrash;
        this.currentWeight = rocketWeight;
    }

    public int getRocketCost() {
        return rocketCost;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return false;
    }

    @Override
    public int carry(Item item) {
        return 0;
    }
}
