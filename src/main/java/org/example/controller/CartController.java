package org.example.controller;

import org.example.models.Cart;
import org.example.service.CartService;
import org.springframework.web.bind.annotation.*;

/**
 * @author kushalsheth
 * @since 19/11/25
 */
@RestController
public class CartController {
    public final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public Cart addCart(@RequestBody Cart cart) {
        return cartService.addCart(cart);
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable String id) {
        return cartService.getCart(id);
    }

    @PostMapping("/add/menuItem/")
    public Cart addMenuItem(@RequestParam String cartId, @RequestParam String menuItemId) {
        return cartService.addMenuItem(cartId, menuItemId);
    }

    @DeleteMapping
    public void deleteCart(@RequestParam String cartId) {
        cartService.removeCart(cartId);
    }

}
