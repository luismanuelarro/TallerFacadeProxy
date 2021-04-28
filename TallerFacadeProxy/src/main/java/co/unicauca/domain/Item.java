package co.unicauca.domain;
/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public class Item {

    private Dish dish;
    private int amount;

    /**
     *
     * @param dish
     * @param amount
     */
    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    /**
     *
     * @return
     */
    public Dish getDish() {
        return dish;
    }

    /**
     *
     * @return
     */
    public int getAmount() {
        return amount;
    }

    /**
     *
     * @param dish
     */
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
