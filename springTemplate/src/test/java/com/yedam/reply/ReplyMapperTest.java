package com.yedam.reply;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.BoardMapperTest;
import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.ReplyVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class ReplyMapperTest {
@Autowired 
private ReplyMapper replyMapper; 

@Test
public void insert() {
	ReplyVO reply=new ReplyVO(); 
	reply.setBno(7);
	reply.setReply("댓글");
	reply.setReplyer("댓글작성자");
	int result=replyMapper.insert(reply); 
	System.out.println(result);
}
//@Test 


}
