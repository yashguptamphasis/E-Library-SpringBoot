package com.example.demo.librarian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Beans.Book;
import com.example.Dao.CreateDao;

@Controller
@ComponentScan(value="com.example.Dao")
public class CreateBook {
	
	@Autowired
	CreateDao createDao;
	
	@RequestMapping(value="createBook")
	String createBook(Book book,ModelMap model)
	{
		int i=createDao.createBook(book);
		
		if(i==1)
		{
			System.out.println("Book Saved");
			model.put("done", "Book Added, what more would you like to do ??");
		}
		else
		{
			System.out.println("Probkem saving the book");
		}
		
		return "views/LibrarianHome.jsp";
	}
}
