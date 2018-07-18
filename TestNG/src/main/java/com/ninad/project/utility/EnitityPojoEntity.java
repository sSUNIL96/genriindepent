package com.ninad.project.utility;

import java.lang.reflect.Field;

public class EnitityPojoEntity {
	
	
	//1 pojo to entity
	
	public static <T1,T2> T2 convetPojoToEntity (T1 pojoobj , T2 entityobj ) throws IllegalArgumentException, IllegalAccessException{
		
		Field [] pojoFields = pojoobj.getClass().getDeclaredFields();
		Field [] entityFields =  entityobj.getClass().getDeclaredFields();		
		
		for (int i = 0 ; i<pojoFields.length;i++){			    
			// get(Object)
		
			entityFields[i].set(entityobj, pojoFields[i].get(pojoobj));
		
		}
		
		return entityobj;
	}
	
	
	
	//2 entity to pojo
	
public static <T1,T2> T2 convetEntityToPojo (T1 entityObj , T2 pojoobj ) throws IllegalArgumentException, IllegalAccessException{
		
		Field [] pojoFields = pojoobj.getClass().getDeclaredFields();
		Field [] entityFields =  entityObj.getClass().getDeclaredFields();		
		
		for (int i = 0 ; i<entityFields.length;i++){			    
			// get(Object)
		
			pojoFields[i].set(pojoobj, entityFields[i].get(entityObj));
		
		}
		
		return pojoobj;
	}
	//3  

}
