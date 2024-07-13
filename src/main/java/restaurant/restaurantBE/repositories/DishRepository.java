package restaurant.restaurantBE.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurant.restaurantBE.models.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {

}
