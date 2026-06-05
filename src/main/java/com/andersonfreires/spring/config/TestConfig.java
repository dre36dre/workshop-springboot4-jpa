package com.andersonfreires.spring.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andersonfreires.spring.entities.User;
import com.andersonfreires.spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1=new User(null,"Maria Luiza","malu","98888888","123456");
		User u2=new User(null,"Victor Hugo","Hugo","97777777","123456");
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
}
