package com.company.book.service;

import java.util.List;

public interface BookService {
		public List<BookVO> findAll(); //도서조회 
		public int bookinsert(BookVO book); //도서 인서트 
		
		public List<RentVO> findAllRent(); //도서대여현황 조회 
}
