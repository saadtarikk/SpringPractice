package com.example.Netflix.NetflixClone;

import com.example.Netflix.NetflixClone.Model.User;
import com.example.Netflix.NetflixClone.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NetflixCloneApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void createUser(){
		User jack = new User("Jack", "Sparrow", 32);
		userRepository.save(jack);
	}

	//dependency injection by using Autowired annotation. which provides us instance of an object
	@Autowired
	UserRepository userRepository;

}
