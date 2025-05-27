package com.yedam.app.sp04;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionTest {

    // 드라이버 로딩
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 실제 DB 연결 테스트
    @Test
    public void testConnection() {
        try (Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr")) {
            log.info("📌 Connection 성공: " + con);
        } catch (Exception e) {
            log.error("❌ 연결 실패: " + e.getMessage());
        }
    }
}
