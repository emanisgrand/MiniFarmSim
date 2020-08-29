public abstract class FarmFauna {
    Harvestable iHarvestable; 
    Cacophonous iCacophonous;

    public FarmFauna(){
    }

    public abstract void display();

    public void exeHarvest(){
        iHarvestable.harvest();
    }
    
    public void exeCacophony(){
        iCacophonous.makeSound();
    }

    public void exeSwim() {
        System.out.println("We all float down here.");
    }

    // These methods exist to be called anytime
    // I need to rapidly change the behavior of my chicken 
    public void setHarvestable(Harvestable h) {
        iHarvestable = h;
    }

    public void setCacophany(Cacophonous c) {
        iCacophonous = c;
    }
}
