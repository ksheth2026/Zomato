package org.example.repository;

import org.example.models.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kushalsheth
 * @since 19/11/25
 */
@Repository
public interface CartRepository extends MongoRepository<Cart, String> {
}
