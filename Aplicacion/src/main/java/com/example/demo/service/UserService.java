package com.example.demo.service;
import javax.validation.Valid;

import com.example.demo.entity.User;

public interface UserService {
	public Iterable<User> getAllUsers();

	public User creteUser(User user) throws Exception;
	
	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
}
