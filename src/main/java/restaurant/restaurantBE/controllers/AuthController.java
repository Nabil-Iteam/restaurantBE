package restaurant.restaurantBE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant.restaurantBE.jwt.JwtUtil;
import restaurant.restaurantBE.models.SignupRequest;
import restaurant.restaurantBE.models.UserModel;
import restaurant.restaurantBE.servicesImpl.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/signup")
	public UserModel signup(@RequestBody SignupRequest signupRequest) {
		UserModel user = new UserModel();
		user.setFirstName(signupRequest.getFirstName());
		user.setLastName(signupRequest.getLastName());
		user.setEmail(signupRequest.getEmail());
		user.setPassword(signupRequest.getPassword());
		user.setExperience(signupRequest.getExperience());
		user.setSpeciality(signupRequest.getSpeciality());
		user.setAddress(signupRequest.getAddress());
		user.setPhone(signupRequest.getPhone());
		return userService.saveUser(user, signupRequest.getRoleNames());
	}

	// Get all Chefs
	@GetMapping("/role/{roles}")
	public List<UserModel> findByRolesName(@PathVariable String roles) {
		return userService.findUsersByRoleName(roles);
	}

	// Get all users
	@GetMapping
	public List<UserModel> getAllUsers() {
		return userService.findAllUsers();
	}

	// Get all users
	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable Long id) {
		userService.deleteUserById(id);
	}

}