package restaurant.restaurantBE.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import restaurant.restaurantBE.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByEmail(String email);
    
    List<UserModel> findByRolesName(String roles);
}
