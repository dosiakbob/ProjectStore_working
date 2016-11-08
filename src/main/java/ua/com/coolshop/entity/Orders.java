package ua.com.coolshop.entity;

import javax.persistence.*;
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
    private List<Commodity> commodities;

    public Orders() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(String[] commodities) {
        this.commodities = commodities;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", commodities=" + commodities +
                '}';
    }
}
