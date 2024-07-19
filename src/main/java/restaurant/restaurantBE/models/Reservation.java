package restaurant.restaurantBE.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@Id
	@Column(name="RESERVATION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private int quantity ;
	private boolean confirmed;
	
	
	@ManyToOne
	@JoinColumn(name = "dish_id")
	@JsonIgnoreProperties("reservations")
	private Dish dish;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnoreProperties("reservations")
	private UserModel user;
	
	public Reservation() {

	}

	
	public Reservation(int quantity, boolean confirmed, Dish dish, UserModel user) {
		super();
		this.quantity = quantity;
		this.confirmed = confirmed;
		this.dish = dish;
		this.user = user;
	}


	public Reservation(int quantity) {
		this.quantity = quantity;
	}


	public Long getId() {
		return id;
	}
	



	public void setId(Long id) {
		this.id = id;
	}

	
	


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	

	public Dish getDish() {
		return dish;
	}


	public void setDish(Dish dish) {
		this.dish = dish;
	}
	
	
	public UserModel getUser() {
		return user;
	}


	public void setUser(UserModel user) {
		this.user = user;
	}

	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", quantity=" + quantity + ", confirmed=" + confirmed + ", dish=" + dish
				+ ", user=" + user + "]";
	}

}
