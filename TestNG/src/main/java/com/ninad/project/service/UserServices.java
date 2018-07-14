package com.ninad.project.service;

import java.util.List;

import com.ninad.project.entities.User;

public interface UserServices {

	
	public void addUser (User user);
	public User getUserById(int id);
	public List<User> getAllUsers();
	public List<User> getUsersbyUsername(String username);
	
	
}
