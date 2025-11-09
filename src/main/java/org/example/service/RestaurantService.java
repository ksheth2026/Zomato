package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.models.MenuItem;
import org.example.models.Restaurant;
import org.example.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author kushalsheth
 * @since 09/11/25
 */
@Service
@Slf4j
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Optional<Restaurant> getRestaurant(String id) {
        return restaurantRepository.findById(id);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant addMenuItem(String restaurantId, MenuItem menuItem) {
        Optional<Restaurant> optionalRestaurant = getRestaurant(restaurantId);
        if (optionalRestaurant.isPresent()) {
            Restaurant restaurant = optionalRestaurant.get();
            List<MenuItem> menuItems = restaurant.getMenuItems();
            menuItems.add(menuItem);
            restaurant.setMenuItems(menuItems);
            return restaurantRepository.save(restaurant);
        } else {
            log.error("[RestaurantService] Restaurant not found with id: {}", restaurantId);
            throw new RuntimeException("Restaurant not found with id: " + restaurantId);
        }
    }
}
