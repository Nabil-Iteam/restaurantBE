package restaurant.restaurantBE.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurant.restaurantBE.models.CartModel;

public interface CartRepository extends JpaRepository<CartModel, Long>{

}
