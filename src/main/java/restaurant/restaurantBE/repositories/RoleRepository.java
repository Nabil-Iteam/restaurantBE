package restaurant.restaurantBE.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurant.restaurantBE.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String roleName);
}
