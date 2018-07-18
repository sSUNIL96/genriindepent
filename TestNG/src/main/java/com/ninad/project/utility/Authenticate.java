package com.ninad.project.utility;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.ninad.project.constants.Myconstants;
import com.ninad.project.entities.User;

// String and public matter ?????


public class Authenticate {

	
	
	
	
	public static String authenticate (String uname , String pwd) throws InterruptedException{
	
		 if (uname.equals("") || pwd.equals("") ){
			return  Myconstants.fieldscantbenull;
		     }
		else {   
			
				List<User> ulist = new GenricDao<User>().getListbyUsername(User.class, uname); //getting list of users with passed ussername
			
				if (ulist.isEmpty()){
				return Myconstants.invaliduname;
				}
				else{  			
				   for (int i=0;i<ulist.size();i++){ 	
					   
			        		if (ulist.get(i).getPassword().equals(pwd)){
			        			System.out.println(" User Authenticated "+ulist.get(i).getUsername());
			        		    return Myconstants.success;  //pwd matched
			        	        }
			           }		//else pwd invalid
				   
				   
				  return Myconstants.invalidpwd;  //aftr checking all pwd from list if no match			         
		         }
		 
		  }	
	}
	
	
}// class
	
		
		
		/*SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session s =sf.openSession();
		Criteria cr = s.createCriteria(User.class);
		cr.add(Restrictions.eq("username", uname));
		cr.add(Restrictions.eq("password", pwd));
		      User uobj =(User)cr.uniqueResult();
		if(uobj==null){
			System.out.println("invalid uname or password");
			return "false";
		}
		return "true";*/
		

																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			