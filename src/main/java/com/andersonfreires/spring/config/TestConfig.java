package com.andersonfreires.spring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andersonfreires.spring.entities.Order;
import com.andersonfreires.spring.entities.User;
import com.andersonfreires.spring.entities.enums.OrderStatus;
import com.andersonfreires.spring.repositories.OrderRepository;
import com.andersonfreires.spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1=new User(null,"Maria Luiza","Malu","98887777","123456");
		User u2=new User(null,"Victor Hugo","Hugo","977766666","123456");
		
		Order o1=new Order(null,Instant.parse("2026-06-20T19:53:07Z"),OrderStatus.CANCELED,u1);
		Order o2=new Order(null,Instant.parse("2026-06-21T03:42:10Z"),OrderStatus.PAID,u2);
		Order o3=new Order(null,Instant.parse("2026-06-22T15:21:22Z"),OrderStatus.SHIPPED,u1);
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
}
