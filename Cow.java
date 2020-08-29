public class Cow extends FarmFauna {
    public Cow(){
        iCacophonous = new MatingCall();
        iHarvestable = new Collect();
    }

    public void display(){
        System.out.println("Moo!");
    }
}