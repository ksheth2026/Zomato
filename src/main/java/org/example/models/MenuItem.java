package org.example.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

/**
 *
 * @author kushalsheth
 * @since 08/11/25
 */
@Data
@Document
public class MenuItem {
    @NotBlank(message = "Menu item name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;

    @Positive(message = "Price must be positive")
    private double price;

    private String category;

    private String imageUrl;

    private boolean available = true;

    public MenuItem() {
    }

    public MenuItem(String name, String description, double price, String category, String imageUrl, boolean available) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
        this.available = available;
    }

    public @NotBlank(message = "Menu item name is required") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Menu item name is required") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Description is required") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Description is required") String description) {
        this.description = description;
    }

    @Positive(message = "Price must be positive")
    public double getPrice() {
        return price;
    }

    public void setPrice(@Positive(message = "Price must be positive") double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
