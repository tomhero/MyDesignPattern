package FactoryPattern;

abstract public class Unit{
    
    String name = "Unkown Unit";
    int healthPoint = 0;
    int ManaPoint = 0;
    double Agility = 0;
    double intelligence = 0;
    double Dextrality = 0;
    double Lucky = 0;
    
    public void prepare() {
        
	System.out.println("Preparing " + name);
        
    }
    
    public void install() {
        
	System.out.println("installing " + name);
        
    }
    
    public void setUp() {
        
	System.out.println("setting up " + name);
        
    }
    
    public void boot() {
        
	System.out.println("booting " + name);
        
    }
    
    
    public void checkStat(){
        
        System.out.println(String.format("\nname : %s\n "
                + "HP : %d\n MP : %d\n Agi : %.2f\n Int : %.2f\n Dex : %.2f\n Luck : %.2f",
                name, healthPoint, ManaPoint, Agility, intelligence, Dextrality, Lucky));
        
    }
    
    public void staminaBuff(int value){
        
        healthPoint += value;
        ManaPoint += value;
        
    }
    
    public void sideEffectBuff(double value){
        
        Agility += value;
        intelligence += value;
        Dextrality += value;
        Lucky += value;
        
        
    }
    
    
}