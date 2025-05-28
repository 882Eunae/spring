package com.yedam.app.work03.mapper;

import java.util.List;

import com.yedam.app.work03.model.BoardVO;


public interface BoardMapper {
	  List<BoardVO> findAll(); // 전체조회
	  int updateTitle(BoardVO board); //update  
	  int insert(BoardVO board); //insert 
	  int delete(BoardVO board);//delete 
}
