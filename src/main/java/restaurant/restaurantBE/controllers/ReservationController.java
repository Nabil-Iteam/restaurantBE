package restaurant.restaurantBE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant.restaurantBE.models.Reservation;
import restaurant.restaurantBE.services.ReservationService;


@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
	
	@Autowired 
	private ReservationService rService;
	
	// METH 1 : Get All Reservationes
	@GetMapping
	public List<Reservation> getAllReservationes(){
		return rService.getAllReservations();
		}
	
	// METH 2 : Get Reservation By Id
	@GetMapping("/{id}")
	public Reservation getReservationById(@PathVariable Long id){
		return rService.getReservationById(id);
		}
	
	
	// METH 3 :  Add Reservation
	@PostMapping
	public Reservation addReservation(@RequestBody Reservation r){
		return rService.addReservation(r);
		}
	

	// METH 4 : Delete Reservation
	@DeleteMapping("/{id}")
	public void deleteReservationById(@PathVariable Long  id){
		rService.deleteReservationById(id);
		}
	
}

