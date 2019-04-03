package com.cts.my_project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.my_project.bean.login;
import com.cts.my_project.service.LoginService;



	@Controller
	public class LoginController {
		
		@Autowired
		LoginService loginService;
		
		
		@RequestMapping("login.html")
		public String getLoginPage(){
			return "login";
		}
		@PostMapping("login.html")
		public ModelAndView validateAdmin(@ModelAttribute login login1,HttpSession httpSession){
			ModelAndView modelAndView = new ModelAndView();
			System.out.println(login1.toString());
			login user2 = loginService.authenticate(login1.getUserName(), login1.getPassword());
			if(loginService.authenticate(login1.getUserName(),login1.getPassword()) != null)
			{
				System.out.println("success");
		    }
			return modelAndView;
		}
	}

