package com.yedam.app.work03;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.yedam.app.work03.*;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionTest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr")) {
			log.info(con);
				}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
