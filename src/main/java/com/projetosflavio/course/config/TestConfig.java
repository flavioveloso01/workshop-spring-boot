package com.projetosflavio.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetosflavio.course.entities.User;
import com.projetosflavio.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmanil.com", "998989898", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmanil.com", "997789898", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
}
