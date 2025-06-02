package com.company.sp06.board.mapper;

import java.util.List;

import com.company.sp06.board.service.*;


public interface BoardMapper {
	public  List<BoardVO> findAll(Criteria cri); // 전체조회
	public long getCount(Criteria cri); // 총건수 
	public int updateTitle(BoardVO board); //update  
	public  int insert(BoardVO board); //insert 
	public  int delete(BoardVO board);//delete 
	public  BoardVO findByBno(int bno); //단건조회 

}
