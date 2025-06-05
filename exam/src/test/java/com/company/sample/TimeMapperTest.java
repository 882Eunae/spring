package com.company.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.company.book.mapper.BookMapper;
import com.company.sample.mapper.TimeMapper;

import lombok.Setter;

@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class TimeMapperTest {

	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Setter(onMethod_ = @Autowired)
	private BookMapper bookMapper; 
	//@Test
	public void testGetTime() {
		System.out.println(timeMapper.getClass().getName());
		System.out.println(timeMapper.getTime());
		System.out.println(timeMapper.getTime2());
	}
	
	//@Test 
	public void 도서조회() {
		System.out.println(bookMapper.findAll());
	}
	@Test 
	public void 대출조회() {
		System.out.println(bookMapper.findAllRent());
	}
}
