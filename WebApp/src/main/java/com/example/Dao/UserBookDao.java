package com.example.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.RequestMapping;

//import com.example.Beans.Book;
import com.example.Beans.Book2;
//import com.example.Beans.User;

@Repository
public class UserBookDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int issueBook(String name)
	{
		System.out.println("Reached here");
		return jdbcTemplate.update("insert into book2 values('"+name+"')");
	}
	


	
	
	
}
