/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author goku-
 */
public class SingleGateway {
    
    private static SingleGateway singleGatewayInstance;

    private SingleGateway() {
        
    }
    
    public static SingleGateway getInstance(){
        
        if (singleGatewayInstance == null){
            
            singleGatewayInstance = new SingleGateway();
            
            return singleGatewayInstance; 
            
        }
        
        return singleGatewayInstance;
        
    }
    
    public void printHello(){
        
        System.out.println("Hello World singleGateway");
        
    }
    
    
    
}
