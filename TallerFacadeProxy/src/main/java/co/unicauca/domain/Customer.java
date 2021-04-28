package co.unicauca.domain;
/**
 *
 * @author Luis Arroyo-Daniel Navia
 */
public class Customer {

    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city;

    /**
     *
     * @param id
     * @param name
     * @param address
     * @param mobile
     * @param city
     */
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
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
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return
     */
    public String getMobile() {
        return mobile;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
