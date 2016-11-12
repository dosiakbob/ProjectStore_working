package ua.com.coolshop.entity;


import javax.persistence.*;
import java.util.List;
@Entity
public class Commodity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "orders_commodity", joinColumns = @JoinColumn(name = "id_commodity"), inverseJoinColumns = @JoinColumn(name = "id_orders"))

    private List<Orders> orderses;

    public Commodity() {
    }

    public Commodity(String price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}


