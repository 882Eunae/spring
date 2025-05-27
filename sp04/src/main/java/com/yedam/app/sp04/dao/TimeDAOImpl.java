package com.yedam.app.sp04.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.hibernate.sql.ast.spi.SqlSelection;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //@Component 스프링컨테이너 빈으로 등록 
public class TimeDAOImpl implements TimeDAO{

	@Autowired SqlSessionFactory sqlSessionFactory; 
	
	@Override
	public String getTime() {
		return sqlSessionFactory.openSession().selectOne("com.yedam.app.sp04.mapper.TimeMapper.getTime2");
	}  
		
		

	
	
}
