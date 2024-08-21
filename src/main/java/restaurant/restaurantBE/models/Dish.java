package restaurant.restaurantBE.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "dishes")
public class Dish {

	@Id
	@Column(name = "DISH_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private Float price;

	@OneToMany(mappedBy = "dish", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("dish")
	private List<Reservation> reservations;

	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnoreProperties("dishes")
	private UserModel user;

	public Dish() {

	}

	public Dish(String name, String description, Float price, List<Reservation> reservations, UserModel user) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.reservations = reservations;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", reservations=" + reservations + ", user=" + user + "]";
	}

	
	


}
