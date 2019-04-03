package com.cts.my_project.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="login")
@Table
public class login {
	@Id
	private String userName;
	private String password;
	public login() {
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "login [userName=" + userName + ", password=" + password + "]";
	}
	public login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	

}
