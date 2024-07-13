package restaurant.restaurantBE.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant.restaurantBE.jwt.JwtUtil;
import restaurant.restaurantBE.models.SignupRequest;
import restaurant.restaurantBE.models.User;
import restaurant.restaurantBE.services.UserService;

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
	public User signup(@RequestBody SignupRequest signupRequest) {
		User user = new User();
		user.setFirstName(signupRequest.getFirstName());
		user.setLastName(signupRequest.getLastName());
		user.setEmail(signupRequest.getEmail());
		user.setPassword(signupRequest.getPassword());

		return userService.saveUser(user, signupRequest.getRoleNames());
	}
	
}

