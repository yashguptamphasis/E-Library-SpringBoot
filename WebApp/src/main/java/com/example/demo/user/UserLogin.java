package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.Validate;

@Controller
@ComponentScan(value="com.example.service")
public class UserLogin {

	@Autowired
	Validate v;
	
	@RequestMapping(value="/UserLogin")
	String loginUserPost(@RequestParam String name,@RequestParam String password,ModelMap model )
	{
		System.out.println("Reached userLogin controller");
	//	System.out.println("Login done :  "+emp.getName());
		if(v.validate(name, password))
		{
			model.put("name", name);
			System.out.println("Validation done calling welocme jsp  "+name);
			return "/views/UserHome.jsp";
		}
		else
		{
			System.out.println("Validation failed calling login jsp");
			//model.put("Error", "Wrong Id password");
			return "/views/Login.jsp";
		}
		
	}
}
