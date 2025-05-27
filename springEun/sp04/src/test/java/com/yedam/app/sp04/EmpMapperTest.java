package com.yedam.app.sp04;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.sp04.mapper.EmpMapper;
import com.yedam.app.sp04.model.Employees;
import com.yedam.app.sp04.model.SearchVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/resources/spring/datasource-context.xml",
		                "file:src/main/resources/spring/mybatis-context.xml"})
public class EmpMapperTest {

	@Autowired EmpMapper empMapper;
	@Test 
	public void 전체조회() {
		SearchVO searchVO=new SearchVO(); 
		//searchVO.setDepartmentId("30");
	//	searchVO.setSalary("3000");
		
		searchVO.setIds(Arrays.asList(100,101,102));
		
		System.out.println("전체조회하기");
		empMapper.findAll(searchVO).forEach(emp->System.out.println(emp.getEmployeeId()+":"+emp.getDepartmentId()));
	}
	
	@Test 
	public void findALLtoMap() {
		empMapper.findALLtoMap().forEach(emp->System.out.println(emp.get("first_name")				                                          ));
	}
	
	@Test
	public void count() {
		System.out.println("숫자실행");
	  List<Employees> result=empMapper.getCount(); 
	  result.forEach(res -> System.out.println(res.getDepartmentId()+":"+res.getCnt()));
	}
	
	//@Test
	public void insert() {
		Employees emp= Employees.builder().employeeId("301").lastName("박")
				.email("c@c.c")
				.jobId("IT_PROG")
				.hireDate("2020/01/01")
				.build(); 
//		emp.setEmployeeId("300");
//		emp.setLastName("김");
//		emp.setEmail("a@a.a");
//		emp.setHireDate("2020/01/01");
//		emp.setJobId("IT_PROG"); 
		
		
		int result=empMapper.insert(emp); 
		
		System.out.println(result);
	}
//	@Test
//	public void update() {
//		Employees emp=new Employees(); 
//		emp.setEmployeeId("300");
//		emp.setFirstName("길동");
//		int result=empMapper.updateFirstName(emp); 
//		System.out.println(result);
//			
//	}
	@Test
	public void delete() {
		int empId=300; 
		System.out.println("삭제...");
		int result=empMapper.delete(empId); 
		System.out.println(result);
			
	}
	
	
}
