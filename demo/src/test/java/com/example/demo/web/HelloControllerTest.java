package com.example.demo.web;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
		@Autowired MockMvc mvc; //프록

		@Test 
		public void hello가_리턴된다() throws Exception {
			String hello="hello";
			mvc.perform(get("/hello"))
			   .andExpect(status().isOk())
			   .andDo(print()); 
		}
		@Test 
		public void helloDto가_리턴된다() throws Exception{
			
			String name="Hello";
			int amount=1000; 
			
			mvc.perform(get("/hello/dto")
					       .param("name", name)
					       .param("amount", String.
	valueOf(amount)))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.name",is(name)))
			.andExpect(jsonPath("$.amount",is(amount))); 				
    }
}
