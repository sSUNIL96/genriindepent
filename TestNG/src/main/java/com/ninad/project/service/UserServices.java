package com.ninad.project.service;

import java.util.HashMap;
import java.util.List;

import com.ninad.project.constants.Myconstants;
import com.ninad.project.entities.User;
import com.ninad.project.pojos.UserPojo;

public interface UserServices {

	
	public void addUser (UserPojo user) throws IllegalArgumentException, IllegalAccessException;
	public UserPojo getUserById(int id) throws IllegalArgumentException, IllegalAccessException;
	
	public List<User> getAllUsers();
	public List<User> getUsersbyUsername(String username);
	public List<UserPojo> searchUser (HashMap<Myconstants.UserFields,String> searchCriteria) throws Exception;
	
	
}
