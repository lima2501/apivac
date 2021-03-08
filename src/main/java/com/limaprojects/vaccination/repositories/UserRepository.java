package com.limaprojects.vaccination.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaprojects.vaccination.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Boolean existsByEmail(String email);
	
}
