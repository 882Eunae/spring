package com.yedam.app.work03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.work03.mapper.BoardMapper;
import com.yedam.app.work03.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
    "classpath:spring/datasource-context.xml",
    "classpath:spring/mybatis-context.xml"
})
public class BoardMapperTest {
	@Autowired 
	BoardMapper boardMapper; 
	
	@Test
	public void 전체조회() {
		boardMapper.findAll().forEach(board->System.out.println(board.getTitle()));
	}
	
	//@Test -> 왜 안되는지 모르겠음 
	public void 수정() {
		BoardVO board=new BoardVO();
		board.setBno(1); 
		board.setTitle("수정제목");	
		int result=boardMapper.updateTitle(board); 
		System.out.println(result);		
	}
	//@Test
	public void insert() {
		BoardVO board=new BoardVO();
		board.setBno(12);
		board.setTitle("insert중...");
		board.setContent("내용");
		board.setWriter("dms");
		
		int result=boardMapper.insert(board);
		System.out.println(result);	
	}
	
	//@Test //삭제완료 
	public void delete() {
	    BoardVO board = new BoardVO();
	    board.setBno(2);
	    int result = boardMapper.delete(board); //결과값 0이 나옴 
	    System.out.println("삭제된 행 수: " + result);
	}
	
	
	
	

}
