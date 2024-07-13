package restaurant.restaurantBE.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservation {
	
	@Id
	@Column(name="RESERVATION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private int quantity ;
	
	public Reservation() {

	}

	public Reservation(int quantity) {
		this.quantity = quantity;
	}


	public Long getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", quantity=" + quantity + "]";
	}

	
    
}
