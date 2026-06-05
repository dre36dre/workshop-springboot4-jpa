package com.andersonfreires.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonfreires.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
