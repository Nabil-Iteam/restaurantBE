package restaurant.restaurantBE.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "carts")
public class CartModel {

	@Id
	@Column(name = "CART_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/* @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cart")
	private List<Reservation> reservations; */

	// @ManyToOne
	// @JoinColumn(name = "client_id")
	// @JsonIgnoreProperties("carts")
	// private UserModel client;

	public CartModel() {

	}

	
	public Long getId() {
		return id;
	}

	

	public void setId(Long id) {
		this.id = id;
	}

	

	@Override
	public String toString() {
		return "CartModel [id=" + id + "]";
	}

}
