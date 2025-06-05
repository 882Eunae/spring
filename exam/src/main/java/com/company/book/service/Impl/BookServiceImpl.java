package com.company.book.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.book.mapper.BookMapper;
import com.company.book.service.BookService;
import com.company.book.service.BookVO;
import com.company.book.service.RentVO;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired BookMapper bookMapper;

	@Override
	public List<BookVO> findAll() {
		
		return bookMapper.findAll(); 
	}

	@Override
	public int bookinsert(BookVO book) {
		// TODO Auto-generated method stub
		return bookMapper.bookinsert(book) ;
	}

	@Override
	public List<RentVO> findAllRent() {
		
		return bookMapper.findAllRent(); 
	} 
	

	
}
