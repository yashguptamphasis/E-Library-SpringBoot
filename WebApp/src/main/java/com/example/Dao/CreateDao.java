package com.example.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Beans.Book;
import com.example.Beans.User;

@Repository
public class CreateDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public int createUser(User emp)
	{				
		String query="insert into user values('"+emp.getName()+"','"+emp.getEmail()+"','"+emp.getPhone()+"','"+emp.getPassword()+"')";
		return jdbcTemplate.update(query);
	}
	
	
	public int createBook(Book book)
	{				
		String query="insert into book values('"+book.getName()+"')";
		return jdbcTemplate.update(query);
	}
}
