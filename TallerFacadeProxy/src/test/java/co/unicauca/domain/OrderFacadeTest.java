/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.domain;

import co.unicauca.acces.IOrderRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public class OrderFacadeTest {
    
    public void testCreateOrder() {
    	
     	 System.out.println("createOrder");
         
         OrderFacade orderFacade = new OrderFacade();
                 
         orderFacade.createOrder(new Customer(1, "Luis Manuel Arroyo", "Calle 10 No. 13-63", "3208978989", "Popayán"));
         orderFacade.addDish(new Dish(1, "Pizza hawaiana", 4000), 3);

         assertEquals(State.NEW, orderFacade.getOrder().getState());

         
         assertEquals("Pizza hawaiana", orderFacade.getOrder().getDetails().get(0).getDish().getName());
         assertEquals(4000, orderFacade.getOrder().getDetails().get(0).getDish().getPrice());
         assertEquals(12000, orderFacade.getOrder().calculateTotal());
         
          orderFacade.changeState(State.FINALIZED);
     	 assertEquals(State.FINALIZED, orderFacade.getOrder().getState());
         
     	 orderFacade.cancelOrder();
     	 assertEquals(State.CANCELLED, orderFacade.getOrder().getState());
    	 
    }
}
