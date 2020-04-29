package com.example.demo;

//import org.hibernate.validator.internal.metadata.facets.Validatable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Beans.User;
import com.example.service.Validate;

@Controller
@ComponentScan(value="com.example.service")
public class BaseLoginController {
	
	
	@Autowired
	Validate v;
	
	@RequestMapping("/")
	public String add()
	{
		System.out.println("Reached here the 1st controller returning login page");
		return "/views/Login.jsp";
	}
	

	
	
	@RequestMapping(value="/AdminLogin")
	String loginAdminPost(@RequestParam String name,
			@RequestParam String password)
	{
		
		System.out.println("Admin login   ");
		if(name.equals("admin@gmail.com")&& password.equals("admin"))
		{
			
			System.out.println("Validation success calling login jsp");
			return "/views/LibrarianHome.jsp";
		}
		else
		{
			System.out.println("Validation failed calling login jsp");
			
			return "/views/Login.jsp";
		}
	}
}
