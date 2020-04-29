package com.example.demo.librarian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Beans.User;
import com.example.Dao.CreateDao;

@Controller
@ComponentScan(value="com.example.Dao")
public class CreateUser {

	@Autowired
	CreateDao createDao;
	

	
	@RequestMapping(value="createUser")
	public String createSubmit(User user, ModelMap model)
	{
		System.out.println("Create values submitted storing and callin login back");
		System.out.println(user.getName());
		System.out.println(user.getPhone());	
		System.out.println(user.getPassword());
		
		model.putIfAbsent("login","Your account is created Login now");
		int i=createDao.createUser(user);
		if(i==1)
		{
			System.out.println("Possitive query: create Query ");
		}
		else if(i==0)
		{
			System.out.println("Negative query: create Query ");
		}	
		model.put("done","User Added, What more will you like to do ??");
		
		return "/views/LibrarianHome.jsp";
	}
	
}