package com.yedam.app.work03;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring/datasource-context.xml")

public class DataSourceTest {

	//@Autowired
	
	@Setter(onMethod_={@Autowired})	
  	DataSource dataSource; //connectionPool 

	@Test
	public void testConnection() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			System.out.println(conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
