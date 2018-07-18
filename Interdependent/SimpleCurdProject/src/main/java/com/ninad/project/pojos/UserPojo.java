package com.ninad.project.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserPojo {

	public int id;
	public String name;
	public String username;
	public String password;
	public String city;
	
	public boolean isActive;
	
	
	
		
	
		public UserPojo(String name, String username, String password, String city) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.city = city;
		this.isActive = isActive;
	}
		
		public UserPojo() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

	
	
}
