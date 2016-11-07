package ua.com.coolshop.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Category {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)

	private int id;
	private String category;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable (name="category_phone", joinColumns=@JoinColumn (name="id_category"),  inverseJoinColumns = @JoinColumn(name = "id_phone"))
	private List<Category> categories;


	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String category, double price) {
		super();
		this.category = category;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category{" +
				"id=" + id +
				", category='" + category + '\'' +
				", categories=" + categories +
				'}';
	}
}
