package com.ninad.project.testng.TestNG;

import java.net.Authenticator;

import com.ninad.project.entities.User;
import com.ninad.project.serviceImpl.UserServiceImpl;
import com.ninad.project.utility.Authenticate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	UserServiceImpl userService = new UserServiceImpl();
    	
    	
       System.out.println(Authenticate.authenticate("ninad","ninad123"));
       /*System.out.println(Authenticate.authenticate(null,null));
       System.out.println(Authenticate.authenticate("ninad"," kdjsfh"));
       System.out.println(Authenticate.authenticate("drgj"," ninad123"));
    	
    	*/
    	
       
    }
}
