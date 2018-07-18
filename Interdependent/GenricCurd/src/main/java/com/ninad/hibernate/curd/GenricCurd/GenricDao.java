package com.ninad.hibernate.curd.GenricCurd;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.ninad.hibernate.Util.SessionFactoryUtil;



public   class GenricDao <T> {
	
	static SessionFactory SF = SessionFactoryUtil.getSessionFactory();
	
	public  void saveObject ( T object ){
		
		Session session = SF.openSession();
		Transaction tr = session.beginTransaction();
		
		session.saveOrUpdate(object);
		
		session.flush();
		tr.commit();
		session.close();
		
		
	}

	public   T getObject (Class T , int id){
		
		Session session = SF.openSession();		
		T obj = (T) session.get(T, id);		
		return obj;
		
	}
	
	public  List<T> getList (Class T) {
		
		Session session = SF.openSession();	
		Criteria cr=  session.createCriteria(T);		
		List<T> list= cr.list();
		
		return list;
		
	}

	public  List<T> getListbyUsername(Class T, String username) {

		Session s =SF.openSession();
		Criteria cr = s.createCriteria(T);
		cr.add(Restrictions.eq("username", username));	
		
		return cr.list();
	}
	
	
	
	
	
}
