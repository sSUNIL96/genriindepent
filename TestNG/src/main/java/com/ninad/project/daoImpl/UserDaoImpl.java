package com.ninad.project.daoImpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.ninad.project.constants.Myconstants.UserFields;
import com.ninad.project.dao.UserDao;
import com.ninad.project.entities.User;
import com.ninad.project.pojos.UserPojo;
import com.ninad.project.serviceImpl.UserServiceImpl;
import com.ninad.project.utility.SessionFactoryUtil;

public class UserDaoImpl implements UserDao{

	public void addUser(User user) {
		
		
	}

	public User getUserById(int id) {
		
		return GenricDao.getObject(User.class, id);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsersbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		UserServiceImpl userService = new UserServiceImpl();
		
		userService.addUser(new UserPojo("Ninad","imninad","imninadpwd","Pune"));
    	userService.addUser(new UserPojo("Ninad","imninad","imninadpwd","Solapur"));
    	userService.addUser(new UserPojo("Ninad","imninad","imninadpwd","Pune"));
    	userService.addUser(new UserPojo("Ninad3","imninad3","imninadpwd","Pune"));
    	
    	HashMap<UserFields, String> searchCriteria = new HashMap();
    	
    	searchCriteria.put(UserFields.USERNAME, "imninad");
    	searchCriteria.put(UserFields.CITY , "Pune");
    	
    	
    	List<UserPojo> list =userService.searchUser(searchCriteria);
	}

	public List<User> searchUser(HashMap<UserFields, String> searchCriteria) {
		SessionFactory SF =SessionFactoryUtil.getSessionFactory();	 	   
		Session session = SF.openSession();		
		
		
		
		Query query = session.createQuery("from User where username =:username  and city=:city");
		
		Set <Entry<UserFields,String>> entryset =searchCriteria.entrySet();
		
		for (Entry<UserFields, String> entry : entryset) {				
			query.setString(entry.getKey().toString().toLowerCase(),entry.getValue());			
		    }
		
		System.out.println("my queryyyyyy "+query.toString());
		List <User> ulist = query.list();
		System.out.println("printing u list "+ulist);
		
		
		
		
		
		
		Criteria cr =session.createCriteria(User.class);
		
		
 	   Set <Entry <UserFields,String>>  entryset2 = searchCriteria.entrySet(); 	   
 	   Iterator <Entry <UserFields,String>>  itr  =entryset2.iterator();
 	   
 	   while (itr.hasNext()){ 		   
 		  Entry <UserFields,String> entry = itr.next(); 		  
 		  UserFields userfield = entry.getKey(); 		  
 		  cr.add(Restrictions.eq(userfield.toString().toLowerCase(), entry.getValue()));
 	      }   
 	   
	         List <User> userlist =	cr.list();
		
		
		return userlist;
	}

}
