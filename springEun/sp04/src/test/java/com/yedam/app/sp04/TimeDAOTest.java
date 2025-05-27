package com.yedam.app.sp04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.sp04.dao.TimeDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/resources/spring/datasource-context.xml",
		                "file:src/main/resources/spring/mybatis-context.xml"})
public class TimeDAOTest {

	@Autowired TimeDAO TimeDAO;
	@Test
	public void getTime() {
		System.out.println(TimeDAO.getTime());	
	}
	
}
