package restaurant.restaurantBE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant.restaurantBE.models.Dish;
import restaurant.restaurantBE.services.DishService;


@RestController
@RequestMapping("/api/dishes")
public class DishController {
	
	@Autowired 
	private DishService mService;
	
	// METH 1 : Get All Dishes
	@GetMapping
	public List<Dish> getAllDishes(){
		return mService.getAllDishes();
		}
	
	// METH 2 : Get Dish By Id
	@GetMapping("/{id}")
	public Dish getDishById(@PathVariable Long id){
		return mService.getDishById(id);
		}
	
	
	// METH 3 :  Add Dish
	@PostMapping
	public Dish addDish(@RequestBody Dish d){
		return mService.addDish(d);
		}
	
	// METH 4 : Edit Dish
	@PutMapping
	public Dish editDish(@RequestBody Dish d){
		return mService.updateDish(d);
		}
	
	// METH 5 : Delete Dish
	@DeleteMapping("/{id}")
	public void deleteDishById(@PathVariable Long  id){
		mService.deleteDishById(id);
		}
	
}

