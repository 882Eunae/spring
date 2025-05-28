package com.yedam.app.sp04.mapper;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.sp04.model.Employees;
import com.yedam.app.sp04.model.SearchVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/resources/spring/datasource-context.xml",
		                "file:src/main/resources/spring/mybatis-context.xml"})
public interface EmpMapper {
      
	List<Employees> findAll(SearchVO search); 
	List<Map> findALLtoMap();
	List<Employees> getCount();
	int insert(Employees employees);
	int updateFirstName(Employees employees);
	int delete(int employeeId); 
 
}
