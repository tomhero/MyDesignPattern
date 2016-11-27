/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author Chayut
 */
public class SingleGatewayTest {
    
    public static void main(String[] args) {
        
        SingleGateway singleGateway = SingleGateway.getInstance();
        
        singleGateway.printHello();
        
        System.out.println("Object 1 ID : " + System.identityHashCode(singleGateway));
        
        
        SingleGateway singleGateway2 = SingleGateway.getInstance();
        
        System.out.println("Object 2 ID : " + System.identityHashCode(singleGateway2));

    }
    
}
