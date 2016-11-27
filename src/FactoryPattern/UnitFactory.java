/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author goku-
 */
public class UnitFactory {

    public Unit buildUnit(String type){
        
        switch (type){
            case "Warrior": return new Warrior();
            case "Archer": return new Archer();
            case "Mystic": return new Mystic();
            // case "Ninja": return new Ninja(); // add new Unit
            default: return null;
        }
        
        
        
    }
    
    
    
}
