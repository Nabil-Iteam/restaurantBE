package restorant.restaurantBE.controllers;

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

import restorant.restaurantBE.models.Dish;
import restorant.restaurantBE.services.DishService;


@RestController
@RequestMapping("/api/dishes")
@CrossOrigin("*")
public class DishController {
	
	@Autowired 
	private DishService mService;
	
	// METH 1 : Get All Matches
	@GetMapping
	public List<Dish> getAllMatches(){
		return mService.getAllDishes();
		}
	
	// METH 2 : Get Match By Id
	@GetMapping("/{id}")
	public Dish getMatchById(@PathVariable Long id){
		return mService.getDishById(id);
		}
	
	
	// METH 3 :  Add Match
	@PostMapping
	public Dish addMatch(@RequestBody Dish d){
		return mService.addDish(d);
		}
	
	// METH 4 : Edit Match
	@PutMapping
	public Dish editMatch(@RequestBody Dish d){
		return mService.updateDish(d);
		}
	
	// METH 5 : Delete Match
	@DeleteMapping("/{id}")
	public void deleteMatchById(@PathVariable Long  id){
		mService.deleteDishById(id);
		}
	
}

