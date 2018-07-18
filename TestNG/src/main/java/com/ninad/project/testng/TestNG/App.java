package com.ninad.project.testng.TestNG;

import java.net.Authenticator;
import java.util.HashMap;
import java.util.List;

import com.ninad.project.constants.Myconstants.UserFields;
import com.ninad.project.entities.User;
import com.ninad.project.pojos.UserPojo;
import com.ninad.project.serviceImpl.UserServiceImpl;
import com.ninad.project.utility.Authenticate;
import com.ninad.project.utility.EnitityPojoEntity;
import com.ninad.project.utility.SessionFactoryUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, IllegalArgumentException, IllegalAccessException
    {
    	UserServiceImpl userService = new UserServiceImpl();
    	
    	userService.addUser(new UserPojo("Ninad","imninad","imninadpwd","Pune"));
    	userService.addUser(new UserPojo("Ninad","imninad","imninadpwd","Solapur"));
    	userService.addUser(new UserPojo("Ninad","imninad","imninadpwd","Pune"));
    	userService.addUser(new UserPojo("Ninad3","imninad3","imninadpwd","Pune"));
    	
    	HashMap<UserFields, String> searchCriteria = new HashMap();
    	
    	searchCriteria.put(UserFields.USERNAME, "imninad");
    	searchCriteria.put(UserFields.CITY , "Pune");
    	
    	
    	List<UserPojo> list =userService.searchUser(searchCriteria);
    	System.out.println(list);
    	
    	
    	
    	
    	
    	/*UserPojo upojo = new UserPojo("n1", "n2");
    	User u = new User();
    	
    	
    	User uentity = EnitityPojoEntity.convetPojoToEntity(upojo,u);
    	
    	System.out.println(uentity);
    	*/
    	
    	
     //  System.out.println(Authenticate.authenticate("ninad","ninad123"));
       
    	
    	//SessionFactoryUtil.getSessionFactory();
       
       /*System.out.println(Authenticate.authenticate(null,null));
       System.out.println(Authenticate.authenticate("ninad"," kdjsfh"));
       System.out.println(Authenticate.authenticate("drgj"," ninad123"));
    	
    	*/
    	
       
    }
}
