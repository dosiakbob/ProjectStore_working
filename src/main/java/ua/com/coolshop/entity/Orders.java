package ua.com.coolshop.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "orders_commodity", joinColumns = @JoinColumn(name = "id_orders"), inverseJoinColumns = @JoinColumn(name = "id_commodity"))
    private String[] commodities;

    public Orders() {
    }

    public Orders(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", commodities=" + Arrays.toString(commodities) +
                '}';
    }
}
