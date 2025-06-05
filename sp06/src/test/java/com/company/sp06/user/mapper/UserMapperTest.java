package com.company.sp06.user.mapper;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.company.sp06.user.service.MemberVO;

@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class UserMapperTest {
		@Autowired MemberMapper memberMapper; 
		
		@Test
		public void read() {
			MemberVO member =memberMapper.read("admin");
			System.out.println(member);
			assertEquals(member.getUserid(), "admin"); //junit 결과는 항상 
		}
}
