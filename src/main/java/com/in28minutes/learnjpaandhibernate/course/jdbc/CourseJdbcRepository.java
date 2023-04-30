package com.in28minutes.learnjpaandhibernate.course.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import com.in28minutes.learnjpaandhibernate.course.Course;

public class CourseJdbcRepository {
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			""" 
			 insert into course (id,name,author)
			 values(1,'Learn AWS','in28minutes')
			  """;
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY);		
	}

}
