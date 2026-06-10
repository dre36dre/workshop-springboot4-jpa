package com.andersonfreires.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonfreires.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
