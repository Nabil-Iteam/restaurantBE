package restorant.restaurantBE.services;

	import java.util.List;

import restorant.restaurantBE.models.Dish;


	public interface DishService {

		public List<Dish> getAllDishes(); 
		public Dish getDishById(Long id); 
		public void deleteDishById(Long id);
		public Dish updateDish(Dish d);
		public Dish addDish(Dish d);
		
	}
