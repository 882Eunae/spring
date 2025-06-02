package com.company.sp06.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.sp06.board.mapper.BoardMapper;
import com.company.sp06.board.service.BoardService;
import com.company.sp06.board.service.BoardVO;
import com.company.sp06.board.service.Criteria;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {
	final BoardMapper boardMapper; 
	
	@Override
	public List<BoardVO> findAll(Criteria cri){
		return boardMapper.findAll(cri);
	}
	
	@Override 
	public int insert(BoardVO board) {
		return boardMapper.insert(board); 	 
	}
	@Override
	public BoardVO findByBno(int bno) {
		return boardMapper.findByBno(bno);
	}
	@Override
	public int delete(BoardVO vo) {
		return boardMapper.delete(vo); 
	}
	@Override
	public int updateTitle(BoardVO vo) {
		return boardMapper.updateTitle(vo); 
	}
	@Override
	public long getCount(Criteria cri) {
		return boardMapper.getCount(cri);
	}
	
	// dddd
	
	
	///야!!!111!! 
}
