package restaurant.restaurantBE.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="dishes")
public class Dish {

	@Id
	@Column(name="DISH_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private String description;
	private Float price;
	
	public Dish() {
		
	}

	public Dish(String name, String description, Float price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	
}
