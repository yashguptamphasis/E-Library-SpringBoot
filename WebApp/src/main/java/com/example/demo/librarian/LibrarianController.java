package com.example.demo.librarian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibrarianController {
	
	@RequestMapping(value="addUser")
	public String addUser()
	{
		return "views/AddUser.jsp";
		
	}
	
	
	@RequestMapping(value="addBook")
	public String addBook()
	{
		return "views/AddBook.jsp";
		
	}
}
