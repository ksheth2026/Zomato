package org.example.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.models.MenuItem;
import org.example.service.MenuItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for MenuItem operations
 *
 * @author kushalsheth
 * @since 08/11/25
 */
@RestController
@RequestMapping("/api/menu-items")
@RequiredArgsConstructor
public class MenuItemController {

    private final MenuItemService menuItemService;

    /**
     * Create a new menu item
     * POST /api/menu-items
     */
    @PostMapping
    public ResponseEntity<MenuItem> createMenuItem(@Valid @RequestBody MenuItem menuItem) {
        MenuItem created = menuItemService.createMenuItem(menuItem);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }
}
