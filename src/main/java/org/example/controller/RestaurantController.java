package org.example.controller;

import jakarta.websocket.server.PathParam;
import org.example.models.MenuItem;
import org.example.models.Restaurant;
import org.example.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author kushalsheth
 * @since 09/11/25
 */
@RestController
@RequestMapping("restaurant")
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @GetMapping
    public Optional<Restaurant> getRestaurant(@PathParam("id") String id) {
        return restaurantService.getRestaurant(id);
    }
    @GetMapping("/all")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping("/{restaurantId}/add/menuItem")
    public Optional<Restaurant> addMenuItem(@PathVariable String restaurantId, @RequestBody MenuItem menuItem) {
        return Optional.ofNullable(restaurantService.addMenuItem(restaurantId, menuItem));
    }


}
