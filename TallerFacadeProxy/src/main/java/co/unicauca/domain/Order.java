package co.unicauca.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public class Order {

    /**
     *
     */
    public int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details;

    /**
     *Constructor
     * @param customer
     */
    public Order(Customer customer) {
        this.customer = customer;
        this.details = new ArrayList<Item>();
        this.state = State.NEW;
    }

    /**
     *
     * @return
     */
    public int getDespatch() {
        return despatch;
    }

    /**
     *
     * @return
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     *
     * @return
     */
    public State getState() {
        return state;
    }

    /**
     *
     * @return
     */
    public List<Item> getDetails() {
        return details;
    }

    /**
     *
     * @param despatch
     */
    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    /**
     *
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     *
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     *
     * @param details
     */
    public void setDetails(List<Item> details) {
        this.details = details;
    }

    /**
     * Método que adiciona un item al pedido
     * @param dish
     * @param amount
     */
    public void addDish(Dish dish, int amount) {
        Item item = new Item(dish, amount);
        this.details.add(item);
    }

    /**
     * Método que calcula el valor total del pedido
     * @return
     */
    public int calculateTotal() {
        int aux = 0;
        int total = 0;
        for (Item item : details) {
            aux = item.getDish().getPrice();
            total += aux * item.getAmount();
        }
        return total;
    }
}
