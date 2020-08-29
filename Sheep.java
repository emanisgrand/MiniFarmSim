public class Sheep extends FarmFauna {
    public Sheep(){
        iCacophonous = new MatingCall();
        iHarvestable = new Consume();
    }

    public void display(){
        System.out.println("Baaah!");
    }
}