package restaurant.restaurantBE.services;

import java.util.List;

import restaurant.restaurantBE.models.Reservation;

public interface ReservationService {

		public List<Reservation> getAllReservations(); 
		public Reservation getReservationById(Long id); 
		public void deleteReservationById(Long id);
		public Reservation addReservation(Reservation r);
		
	}

