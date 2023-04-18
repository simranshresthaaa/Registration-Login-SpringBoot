package com.simran.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simran.model.User;
import com.simran.model.Role;
import com.simran.repo.UserRepository;
import com.simran.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(),registrationDto.getEmail(),
				registrationDto.getPassword(),Arrays.asList(new Role("Role_User")));
		return userRepository.save(user);
	}

}
