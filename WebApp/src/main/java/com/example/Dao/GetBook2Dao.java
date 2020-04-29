package com.example.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Beans.Book2;

@Repository
@ComponentScan(value="com.example.Beans")
public class GetBook2Dao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<Book2> getBooks()
	{
		System.out.println("reached get book");
		return jdbcTemplate.query("select * from book2", new BeanPropertyRowMapper(Book2.class));
	}
}
