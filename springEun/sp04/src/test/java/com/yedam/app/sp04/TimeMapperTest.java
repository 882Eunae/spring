package com.yedam.app.sp04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.sp04.mapper.TimeMapper;

import lombok.Setter;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/resources/spring/datasource-context.xml",
		                "file:src/main/resources/spring/mybatis-context.xml"})
public class TimeMapperTest {
	@Setter(onMethod_= {@Autowired})
TimeMapper timeMapper;
	
	@Test
	public void getTime() {
		System.out.println(timeMapper.getTime());
	}
	
	@Test
	public void getTime2() {
		System.out.println(timeMapper.getTime2());
	}
	
	

}
