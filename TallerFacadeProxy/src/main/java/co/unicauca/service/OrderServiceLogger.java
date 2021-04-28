package co.unicauca.service;

import co.unicauca.acces.IOrderRepository;
import co.unicauca.domain.OrderFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public class OrderServiceLogger implements IOrderService {

    private OrderFacade orderFacade;
    Logger logger = LoggerFactory.getLogger(OrderServiceLogger.class);;

    /**
     * Constructor
     */
    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade; 
    }

    /**
     * Método para poder llevar los logs
     *
     * @param repo Repositorio
     */
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(orderFacade.getOrder());
        
        // Se hace el log 
        String message = "Pedido guardado en la base de datos";
        logger.info("Pedido guardado en la base de datos");
    }
}
