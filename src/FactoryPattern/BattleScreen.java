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
public class BattleScreen {
    
   UnitFactory factory;

    public BattleScreen(UnitFactory factory) {
        this.factory = factory;
    }
    
    public Unit SelectUnit(String type){
        
        Unit someUnit;
        
        someUnit = factory.buildUnit(type);
        
        someUnit.prepare();
        someUnit.install();
        someUnit.setUp();
        someUnit.boot();
        
        return someUnit;
    }
    
}
