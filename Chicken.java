public class Chicken extends FarmFauna {
    public Chicken() {
        iCacophonous = new FeedingCall();
        iHarvestable = new Collect();
    }

    public void display() {
        System.out.println("Bawk!");
    }
}