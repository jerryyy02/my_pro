package com.cts.my_project.service;

import com.cts.my_project.bean.login;

public interface LoginService {
	public login authenticate(String userName, String password);
}
