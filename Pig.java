public class Pig extends FarmFauna {
    public Pig(){
        iCacophonous = new ThreatningCall();
        iHarvestable = new Collect();
    }

    public void display(){
        System.out.println("Oink!");
    }
}