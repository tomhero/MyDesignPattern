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
public class UnitOrderTest {
    
    public static void main(String[] args) {
        
        UnitFactory unitFactory = new UnitFactory();
        
        BattleScreen gameScreen = new BattleScreen(unitFactory);
        
        Unit someWarrior = gameScreen.SelectUnit("Warrior");
        someWarrior.checkStat();
        
        someWarrior.staminaBuff(1000);
        someWarrior.checkStat();
        
        someWarrior.sideEffectBuff(0.5);
        someWarrior.checkStat();
        
        
        Unit someMystic = gameScreen.SelectUnit("Mystic");
        someMystic.checkStat();
        
        someMystic.staminaBuff(2500);
        someMystic.checkStat();
        
        
    }
    
}
