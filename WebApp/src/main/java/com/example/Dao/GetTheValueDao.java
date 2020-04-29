package com.example.Dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.Beans.User;

@Repository
@ComponentScan(value="")
public class GetTheValueDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> getEmpList()
	{
		return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper(User.class));
	}
}
