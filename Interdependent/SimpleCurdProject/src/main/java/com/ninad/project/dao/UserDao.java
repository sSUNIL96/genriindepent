package com.ninad.project.dao;

import java.util.HashMap;
import java.util.List;

import com.ninad.project.constants.Myconstants;
import com.ninad.project.entities.User;

public interface UserDao {

	public void addUser (User user);
	public User getUserById(int id);
	public List<User> getAllUsers();
	public List<User> getUsersbyUsername(String username);
	public List<User> searchUser (HashMap<Myconstants.UserFields,String> searchCriteria);
	
	
	
	
	
}
