public class MiniFarmSimulator {
    public static void main (String[] args) {
        FarmFauna _chicken = new Chicken();
        //FarmFauna _cow = new Cow();
        //FarmFauna _ostrich = new Ostrich();
        _chicken.exeCacophony();
        _chicken.display();
        _chicken.exeHarvest();
        // invoke the class's inherited setter method
        // display change at runtime
        _chicken.setCacophany(new ThreatningCall());
        _chicken.exeCacophony();    
    }
    
}