package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Beans.Book;
import com.example.Beans.Book2;
import com.example.Dao.GetBook2Dao;
import com.example.Dao.GetBooksDao;
import com.example.Dao.UserBookDao;

@Controller
@ComponentScan(value="com.example.Dao")
public class UserController {
	
	@Autowired
	GetBooksDao booksdao; 
	
	@Autowired
	UserBookDao ud;
	
	@RequestMapping(value="issueBook")
	public String issueBook(ModelMap model)
	{
		List<Book> list1= booksdao.getBooks();
		model.put("list", list1);
		return "views/IssueBook.jsp";
		
	}

	
	@RequestMapping(value="/issueBook2")
	public String issueBook2(@RequestParam String name,ModelMap model)
	{
		System.out.println("Reached Issue Book 2 Controller ");
		System.out.println("Name is : "+name);
		
		int i=ud.issueBook(name);
		System.out.println(i);
		return "views/UserHome.jsp";
	}
	
	
	
	//----------------------------------------------------------------------------
	@Autowired
	GetBook2Dao d;
	@RequestMapping(value="returnBook")
	public String returnBook(ModelMap model)
	{
		List<Book2> list3=d.getBooks() ;
		System.out.println(list3.get(1).getName());
		model.put("list1", list3);
		return "views/ReturnBook.jsp";
	}
	
	@RequestMapping(value="returnBook2")
	public String returnBook2()
	{
			return "views/UserHome.jsp";
	}
	
	
	//------------------------------------------------------------------------------------
	@Autowired
	GetBook2Dao obj;
	@RequestMapping(value="viewBook")
	public String viewBook(ModelMap model)
	{
	
		System.out.println("Reached view controller");
		System.out.println("Calling get book");
		List<Book2> list1= obj.getBooks();
		System.out.println(list1.get(1).getName());
		
		model.put("list", list1);
		return "views/ViewBook.jsp";
		
	}
	
}
