package org.example.repository;

import org.example.models.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for MenuItem CRUD operations
 * Currently supports only create operation
 *
 * @author kushalsheth
 * @since 08/11/25
 */
@Repository
public interface MenuItemRepository extends MongoRepository<MenuItem, String> {
    // MongoRepository provides save() method for create operation
    // No additional methods needed for now
}
