package com.ninad.project.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.ninad.project.utility.SessionFactoryUtil;


public class GenricDao {
	
	static SessionFactory SF = SessionFactoryUtil.getSessionFactory();
	
	public static <T> void saveObject ( T object ){
		
		Session session = SF.openSession();
		Transaction tr = session.beginTransaction();
		
		session.saveOrUpdate(object);
		
		session.flush();
		tr.commit();
		session.close();
		
		
	}

	public static <T> T getObject (Class T , int id){
		
		Session session = SF.openSession();		
		T obj = (T) session.get(T, id);		
		return obj;
		
	}
	
	public static <T>  List<T> getList (Class T) {
		
		Session session = SF.openSession();	
		Criteria cr=  session.createCriteria(T);		
		List<T> list= cr.list();
		
		return list;
		
	}

	public static <T> List<T> getListbyUsername(Class T, String username) {

		Session s =SF.openSession();
		Criteria cr = s.createCriteria(T);
		cr.add(Restrictions.eq("username", username));	
		
		return cr.list();
	}
	
	
	
	
	
}
