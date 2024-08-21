package restaurant.restaurantBE.services;

import java.util.List;

import restaurant.restaurantBE.models.CartModel;

public interface CartService {
	
	public List<CartModel> getAllCarts(); 
	public CartModel getCartById(Long id); 
	public void deleteCartById(Long id);
	public CartModel saveCart(CartModel c);

}
