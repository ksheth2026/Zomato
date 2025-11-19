package org.example.service;

import org.example.models.Cart;
import org.example.repository.CartRepository;
import org.springframework.stereotype.Service;

/**
 * @author kushalsheth
 * @since 19/11/25
 */
@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart getCart(String id) {
        return cartRepository.findById(id).orElse(null);
    }

    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void removeCart(String id) {
        cartRepository.deleteById(id);
    }

    public Cart addMenuItem(String cartId, String menuItemId) {
        Cart cart = cartRepository.findById(cartId).get();
        cart.addMenuItemId(menuItemId);
        return cartRepository.save(cart);
    }
}
