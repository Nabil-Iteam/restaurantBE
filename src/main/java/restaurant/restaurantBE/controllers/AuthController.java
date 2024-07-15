package restaurant.restaurantBE.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant.restaurantBE.jwt.JwtUtil;
import restaurant.restaurantBE.models.LoginRequest;
import restaurant.restaurantBE.models.SignupRequest;
import restaurant.restaurantBE.models.UserModel;
import restaurant.restaurantBE.servicesImpl.*;

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
	
	
	
}