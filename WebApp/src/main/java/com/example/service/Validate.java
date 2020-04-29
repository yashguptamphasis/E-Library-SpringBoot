package com.example.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Beans.User;
import com.example.Dao.GetTheValueDao;

@Service
@ComponentScan(value="com.example.Dao")
public class Validate {
	
	@Autowired
	GetTheValueDao dao;
	
	public boolean validate(String n,String p)
	{
		List<User> l=dao.getEmpList();

		boolean flag=false;
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			User e=l.get(i);
			
			if(n.equals(e.getEmail())&&p.equals(e.getPassword()))
			{
				flag= true;
			}
			else
			{
				flag= false;
			}
			
		//	System.out.println(e);
		}
		return flag;


	}
}
