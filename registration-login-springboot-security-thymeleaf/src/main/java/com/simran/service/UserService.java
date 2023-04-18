package com.simran.service;

import com.simran.model.User;
import com.simran.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
