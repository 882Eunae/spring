package com.yedam.sp09;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.app.config.DatasourceConfig;
import com.yedam.app.config.MybatisConfig;
import com.yedam.app.config.RootConfig;
import com.yedam.app.mapper.TimeMapper;

import lombok.extern.log4j.Log4j2;
@Log4j2
@SpringJUnitConfig({RootConfig.class,DatasourceConfig.class,MybatisConfig.class}) 
public class DataSourceTest {
		//빈 꺼내쓰기 
	@Autowired DataSource dataSource; 
	
	@Autowired TimeMapper timeMapper; 
	
	@Test 
	public void getTime() {
		log.info(timeMapper.getTime2());
	}
	
	
	@Test 
	public void connectionTest() throws SQLException {
		Connection coon=dataSource.getConnection();
		log.info(coon);
	}
}
