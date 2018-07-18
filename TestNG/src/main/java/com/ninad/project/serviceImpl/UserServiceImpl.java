package com.ninad.project.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityTransaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.ninad.project.constants.Myconstants.UserFields;
import com.ninad.project.dao.UserDao;
import com.ninad.project.daoImpl.UserDaoImpl;
import com.ninad.project.entities.User;
import com.ninad.project.pojos.UserPojo;
import com.ninad.project.service.UserServices;
import com.ninad.project.utility.EnitityPojoEntity;
import com.ninad.project.utility.GenricDao;
import com.ninad.project.utility.SessionFactoryUtil;

public class UserServiceImpl implements UserServices {

	
	public static UserDaoImpl userDao = new UserDaoImpl();
	
	public void addUser(UserPojo user) throws IllegalArgumentException, IllegalAccessException {		
		
           new GenricDao<User>().saveObject(EnitityPojoEntity.convetPojoToEntity(user, new User()));
		
	}

	public UserPojo getUserById(int id) throws IllegalArgumentException, IllegalAccessException {
		
		User u =userDao.getUserById(id);
		UserPojo upojo= EnitityPojoEntity.convetEntityToPojo(u, new UserPojo());
		return upojo;
		//return GenricDao.getObject(User.class, id);
	}

	public List<User> getAllUsers() {

		return new GenricDao<User>().getList(User.class);
	}

	public List<User> getUsersbyUsername(String username) {
		
		return new GenricDao<User>().getListbyUsername(User.class,username);
	}

	
	
	public List<UserPojo> searchUser(HashMap<UserFields, String> searchCriteria) throws IllegalArgumentException, IllegalAccessException {
	
		List<User> list = userDao.searchUser(searchCriteria);
		List<UserPojo> pojolist = new ArrayList<UserPojo>();
		
		for( User u : list){
			pojolist.add(EnitityPojoEntity.convetEntityToPojo(u, new UserPojo()));
		}
		
		return pojolist;
	}
	
	
	

}
