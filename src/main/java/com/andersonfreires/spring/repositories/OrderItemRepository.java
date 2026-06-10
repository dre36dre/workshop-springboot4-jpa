package com.andersonfreires.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonfreires.spring.entities.OrderItem;
import com.andersonfreires.spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
