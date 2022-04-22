package com.qumu.userstore.repository;

import com.qumu.userstore.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Spring Data JPA repository implementation that deals with User objects.
 */
public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
}
