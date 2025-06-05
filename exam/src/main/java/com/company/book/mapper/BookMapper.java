package com.company.book.mapper;

import java.util.List;

import com.company.book.service.BookVO;
import com.company.book.service.RentVO;

public interface BookMapper {
    public List<BookVO> findAll(); //도서조회 
    public int bookinsert(BookVO book); 
    
    public List<RentVO> findAllRent(); 
}
