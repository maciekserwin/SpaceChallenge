public class U1 extends Rocket {

    public U1() {
        super(100, 10000, 18000, 0.05, 0.01, 100);
    }

    @Override
    public boolean launch() {
        double random = Math.random();
        return random > getChanceOfLaunchExplosion() * (getCurrentWeight() - getRocketWeight()) / (getMaxWeight() - getRocketWeight());
    }

    @Override
    public boolean land() {
        return super.land();
    }
}
