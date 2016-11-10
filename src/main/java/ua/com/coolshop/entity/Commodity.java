package ua.com.coolshop.entity;


import javax.persistence.*;
import java.util.List;
@Entity
public class Commodity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String amount;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "orders_commodity", joinColumns = @JoinColumn(name = "id_commodity"), inverseJoinColumns = @JoinColumn(name = "id_orders"))

    private List<Commodity> commodities;

    public Commodity(String commodityName, String commodityAmount) {
    }

    public Commodity(String name, String amount, List<Commodity> commodities) {
        this.name = name;
        this.amount = amount;
        this.commodities = commodities;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }



    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", commodities=" + commodities +
                '}';
    }
}
