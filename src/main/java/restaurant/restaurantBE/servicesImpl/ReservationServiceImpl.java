package restaurant.restaurantBE.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurant.restaurantBE.models.Reservation;
import restaurant.restaurantBE.repositories.ReservationRepository;
import restaurant.restaurantBE.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository rRepo;

    @Override
    public List<Reservation> getAllReservations() {
        // TODO Auto-generated method stub
        return rRepo.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        // TODO Auto-generated method stub
        Optional<Reservation> r = rRepo.findById(id);
		return r.isPresent() ? r.get() : null ;    
    }

    @Override
    public void deleteReservationById(Long id) {
        // TODO Auto-generated method stub
        rRepo.deleteById(id);
    }

    @Override
    public Reservation addReservation(Reservation r) {
        // TODO Auto-generated method stub
        return rRepo.save(r);
    }

}
