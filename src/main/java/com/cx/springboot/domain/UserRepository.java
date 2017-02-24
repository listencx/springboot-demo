package com.cx.springboot.domain;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "users")
public interface UserRepository extends CrudRepository<User, Long> {

	@Query("from User e where e.usersName = ?1")
	List<User> getUser(String name);
	
	@Cacheable
	User findByUsersName(String string);
}
