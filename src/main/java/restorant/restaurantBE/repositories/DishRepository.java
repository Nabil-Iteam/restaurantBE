package restorant.restaurantBE.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restorant.restaurantBE.models.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {

}
