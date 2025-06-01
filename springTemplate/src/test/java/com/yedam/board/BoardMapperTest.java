package com.yedam.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardVO;

import lombok.extern.log4j.Log4j2;


@Log4j2
@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class BoardMapperTest {

	@Autowired 
	private	BoardMapper boardMapper; 
	
//	@Test
//	public void 전체조회() {
//		boardMapper.findAll().forEach(board->System.out.println(board.getTitle()));
//	}
	
	//@Test 
	public void 수정() {
		BoardVO board=new BoardVO();
		board.setBno(1); 
		board.setTitle("수정제목ddd");	
		int result=boardMapper.updateTitle(board); 
		System.out.println(result);		
	}
	//@Test
	public void insert() {
		BoardVO board=new BoardVO();
		board.setBno(12);
		board.setTitle("insert중...ㅎㅎ");
		board.setContent("내용");
		board.setWriter("dms");
		
		int result=boardMapper.insert(board);
		System.out.println(result);	
	}
	
	//@Test //삭제완료 
	public void delete() {
	    BoardVO board = new BoardVO();
	    board.setBno(12);
	    int result = boardMapper.delete(board); //결과값 0이 나옴 
	    System.out.println("삭제된 행 수: " + result);
	}
	
	
	
	

}
