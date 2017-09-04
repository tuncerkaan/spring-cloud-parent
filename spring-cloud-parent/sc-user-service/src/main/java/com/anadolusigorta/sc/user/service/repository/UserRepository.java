package com.anadolusigorta.sc.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anadolusigorta.sc.user.service.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findUserByName(String name);
	
}
