public class U2 extends Rocket {
    public U2() {
        super(120, 18000, 29000, 0.04, 0.08, 120);
    }

    @Override
    public boolean launch() {
        double random = Math.random();
        return random > getChanceOfLaunchExplosion() * (getCurrentWeight() - getRocketWeight()) / (getMaxWeight() - getRocketWeight());
    }

    @Override
    public boolean land() {
        double random = Math.random();
        return random > getChanceOfLandingCrash() * (getCurrentWeight() - getRocketWeight()) / (getMaxWeight() - getRocketWeight());
    }
}
