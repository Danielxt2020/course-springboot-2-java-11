package com.danielxts.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielxts.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
