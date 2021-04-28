package co.unicauca.acces;

import co.unicauca.domain.Order;
/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public class OrderRepository implements IOrderRepository {

    @Override
    public void save(Order order) {
        System.out.println("Pedido grabado con éxito en la base de datos");
    }

    //Repositorio
    @Override
    public void createOrder(Order order) {
    }
}
