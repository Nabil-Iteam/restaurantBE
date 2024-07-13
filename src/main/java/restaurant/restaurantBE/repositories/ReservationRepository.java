package restaurant.restaurantBE.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurant.restaurantBE.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
