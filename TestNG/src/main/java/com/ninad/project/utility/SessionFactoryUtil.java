package com.ninad.project.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory (){
		
		if (sf==null){			
			sf= new Configuration().configure().buildSessionFactory();
		}
		
		return sf;
	}
	

}
