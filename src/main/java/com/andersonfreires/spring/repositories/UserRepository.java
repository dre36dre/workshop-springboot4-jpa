package com.andersonfreires.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonfreires.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
