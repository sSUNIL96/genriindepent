package com.ninad.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int id;
	public String name;
	public String username;
	public String password;
	public String city;
	
	public boolean isActive;
	
	

	


	public User(String name, String username, String password, String city) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.city = city;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public boolean isActive() {
		return isActive;
	}





	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
