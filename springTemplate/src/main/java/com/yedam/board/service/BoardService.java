package com.yedam.board.service;

import java.util.List;

public interface BoardService { 
	public List<BoardVO> findAll(Criteria cri);
	int insert(BoardVO board); 
	BoardVO findByBno(int bno);
    int updateTitle(BoardVO board);
    int delete(BoardVO board);
    long getCount(Criteria cri); 
}
