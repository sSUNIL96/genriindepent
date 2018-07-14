package com.ninad.project.serviceImpl;

import java.util.List;

import com.ninad.project.entities.User;
import com.ninad.project.service.UserServices;
import com.ninad.project.utility.GenricDao;

public class UserServiceImpl implements UserServices {

	
	public void addUser(User user) {

           GenricDao.saveObject(user);
		
	}

	public User getUserById(int id) {
		
		return GenricDao.getObject(User.class, id);
	}

	public List<User> getAllUsers() {

		return GenricDao.getList(User.class);
	}

	public List<User> getUsersbyUsername(String username) {
		
		return GenricDao.getListbyUsername(User.class,username);
	}

}
