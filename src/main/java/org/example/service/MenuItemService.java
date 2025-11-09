package org.example.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.models.MenuItem;
import org.example.repository.MenuItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service layer for MenuItem business logic
 *
 * @author kushalsheth
 * @since 08/11/25
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;

    /**
     * Create a new menu item
     */
    @Transactional
    public MenuItem createMenuItem(MenuItem menuItem) {
        MenuItem savedItem = menuItemRepository.save(menuItem);
        return savedItem;
    }
}
