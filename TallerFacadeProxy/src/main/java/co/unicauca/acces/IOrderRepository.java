package co.unicauca.acces;

import co.unicauca.domain.Order;
/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public interface IOrderRepository {

    /**
     * Método que almacena un pedido
     */
    public void save(Order order);

    /**
     * Método que crea un pedido
     */
    public void createOrder(Order order);

}
