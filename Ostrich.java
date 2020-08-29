public class Ostrich extends FarmFauna {
    public Ostrich(){
        iCacophonous = new FeedingCall();
        iHarvestable = new Collect();
    }

    public void display() {
        System.out.println("Ostrich!");
    }
}