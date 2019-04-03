package com.cts.my_project.dao;


import com.cts.my_project.bean.login;

public interface LoginDAO {
	
	public login authenticate(String userName, String password);
	

}
