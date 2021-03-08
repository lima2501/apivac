package com.limaprojects.vaccination.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limaprojects.vaccination.dto.UserDto;
import com.limaprojects.vaccination.entities.User;
import com.limaprojects.vaccination.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(UserDto userDto) {
		
		User user = userDto.toUser();
		this.userRepository.save(user);
	
		return user;
	}
	
}
