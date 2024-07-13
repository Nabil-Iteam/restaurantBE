package restaurant.restaurantBE.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import restaurant.restaurantBE.models.Dish;
import restaurant.restaurantBE.repositories.DishRepository;
import restaurant.restaurantBE.services.DishService;

@Service
public class DishServiceImpl implements DishService{

	@Autowired
	private DishRepository dRepo;
	
	@Override
	public List<Dish> getAllDishes() {
		// TODO Auto-generated method stub
		return dRepo.findAll();
	}

	@Override
	public Dish getDishById(Long id) {
		// TODO Auto-generated method stub
		Optional<Dish> d = dRepo.findById(id);
		return d.isPresent() ? d.get() : null ;
	}

	@Override
	public void deleteDishById(Long id) {
		// TODO Auto-generated method stub
		dRepo.deleteById(id);
	}

	@Override
	public Dish updateDish(Dish d) {
		// TODO Auto-generated method stub
		return dRepo.save(d);
	}

	@Override
	public Dish addDish(Dish d) {
		// TODO Auto-generated method stub
		return dRepo.save(d);
	}

}
