package org.example.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kushalsheth
 * @since 19/11/25
 */
@Document
public class Cart {
    private String id;
    private String restaurantId;
    private final List<String> menuItemIds = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public List<String> getMenuItemIds() {
        return menuItemIds;
    }

    public Cart() {
    }

    public Cart(String id, String restaurantId) {
        this.id = id;
        this.restaurantId = restaurantId;
    }

    public void addMenuItemId(String menuItemId) {
        this.menuItemIds.add(menuItemId);
    }
}
