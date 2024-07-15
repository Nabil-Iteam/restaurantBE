package restaurant.restaurantBE.servicesImpl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import restaurant.restaurantBE.models.RoleModel;
import restaurant.restaurantBE.models.UserModel;
import restaurant.restaurantBE.repositories.RoleRepository;
import restaurant.restaurantBE.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserModel saveUser(UserModel user, Set<String> roleNames) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        Set<RoleModel> roles = new HashSet<>();
        for (String roleName : roleNames) {
            RoleModel role = roleRepository.findByName(roleName);
            if (role != null) {
                roles.add(role);
            }
        }
        user.setRoles(roles);

        return userRepository.save(user);
    }

    public UserModel findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel user = findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), (Collection<? extends GrantedAuthority>) user.getRoles());
    }
}

