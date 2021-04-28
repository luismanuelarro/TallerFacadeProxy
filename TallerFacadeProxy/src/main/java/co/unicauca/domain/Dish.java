package co.unicauca.domain;

/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public class Dish {

    private int id;
    private String name;
    private int price;

    /**
     *
     * @param id
     * @param name
     * @param price
     */
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getPrice() {
        return price;
    }
}
