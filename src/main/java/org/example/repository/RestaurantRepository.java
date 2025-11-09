package org.example.repository;

import org.example.models.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kushalsheth
 * @since 09/11/25
 */
@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
}
