package org.example.repository;

import org.example.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kushalsheth
 * @since 22/11/25
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
