package restaurant.restaurantBE.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import restaurant.restaurantBE.models.RoleModel;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {
	RoleModel findByName(String name);
}
