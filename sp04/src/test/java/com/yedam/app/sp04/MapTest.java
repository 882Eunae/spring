package com.yedam.app.sp04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MapTest {
	
	@Test
	public void  test1() {
		List<Map<String,String>> list=new ArrayList<>();
		// 제너리표현 
		Map<String,String> map=new HashMap<>();
		map.put("first_name", "scott"); 
		map.put("last_name", "king"); 
		
		list.add(map); 
		map=new HashMap<>(); 
		map.put("first_name", "길동"); 
		map.put("last_name", "홍"); 
		list.add(map); 
		//foreach 도려서 ->first_name 만 출력 
		
		list.forEach(emp->System.out.println(emp.get("first_name")));
		// list.forEach(System.out::println );    
		//System.out.println(list);
	}
}
