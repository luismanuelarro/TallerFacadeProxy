package co.unicauca.service;

import co.unicauca.acces.Factory;
import co.unicauca.acces.IOrderRepository;
/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public class ProxyClient {
        /**
     * Servicio
     */
    private IOrderService orderService;

    /**
     * Constructor
     */
    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * M�todo para realizar un pedido
     */
    public void createOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }
    
}
