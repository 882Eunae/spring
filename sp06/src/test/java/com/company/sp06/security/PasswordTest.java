package com.company.sp06.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordTest {
    @Test
    public void test() {
    	String rawPw="1234"; 
    	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(10);
    	String result=encoder.encode(rawPw);
    	System.out.println(result);
    	//assertEquals(rawPw, null);
    //	assertFalse(encoder.matches(rawPw, result)); //error떠야함 
    	assertTrue(encoder.matches(rawPw, result));
    }
}
