package com.danielxts.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielxts.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
