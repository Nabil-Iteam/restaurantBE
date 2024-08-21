package restaurant.restaurantBE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant.restaurantBE.models.CartModel;
import restaurant.restaurantBE.services.CartService;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping
    public List<CartModel> getAllCarts(@PathVariable Long id) {
    	return cartService.getAllCarts();
    }
    
    @PostMapping
    public CartModel createCart(@RequestBody CartModel cart) {
        return cartService.saveCart(cart); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartModel> getCartById(@PathVariable Long id) {
    	CartModel cart = cartService.getCartById(id);
        return ResponseEntity.ok(cart);
    }

    @DeleteMapping("/{id}")
    public void deleteCartById(@PathVariable Long id) {
        cartService.deleteCartById(id);
    }
    
}
    