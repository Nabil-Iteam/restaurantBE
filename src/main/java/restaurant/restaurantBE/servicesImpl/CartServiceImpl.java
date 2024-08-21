package restaurant.restaurantBE.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restaurant.restaurantBE.models.CartModel;
import restaurant.restaurantBE.repositories.CartRepository;
import restaurant.restaurantBE.services.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
    private CartRepository cartRepository;
	
	@Override
	public List<CartModel> getAllCarts() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}

	@Override
	public CartModel getCartById(Long id) {
		// TODO Auto-generated method stub
		return cartRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteCartById(Long id) {
		// TODO Auto-generated method stub
		cartRepository.deleteById(id);
	}

	@Override
	public CartModel saveCart(CartModel c) {
		// TODO Auto-generated method stub
		return cartRepository.save(c);
	}

}
