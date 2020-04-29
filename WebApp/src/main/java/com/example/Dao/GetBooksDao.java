package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Beans.Book;
import com.example.Beans.User;

@Repository
public class GetBooksDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> getBooks()
	{
		return jdbcTemplate.query("select * from book", new BeanPropertyRowMapper(Book.class));
	}
}
