package ua.com.coolshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Phones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private int id;
	private String brand;
	private double size;
	private double price;

	@JoinTable(name="phone_category", joinColumns=@JoinColumn(name="id_phones"), inverseJoinColumns = @JoinColumn(name = "id_category"))
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Phones>phones;
	
	public Phones() {
		// TODO Auto-generated constructor stub
	}

	public Phones(String brand, double size, double price) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PhonesEntity [brand=" + brand + ", size=" + size + ", price=" + price + "]";
	}

}
