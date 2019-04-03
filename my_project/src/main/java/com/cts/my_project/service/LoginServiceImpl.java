package com.cts.my_project.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.my_project.service.LoginService;
import com.cts.my_project.bean.login;
import com.cts.my_project.dao.LoginDAO;

public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDAO loginDAO;

	public login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(userName, password);
	}

}
