package co.unicauca.service;

import co.unicauca.acces.IOrderRepository;
/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public interface IOrderService {

    /**
     * Método que guarda un pedido
     *
     * @param repo Repositorio
     */
    public void save(IOrderRepository repo);
}
