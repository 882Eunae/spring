package com.yedam.domain;

import java.util.List;

import lombok.Data;

@Data
public class EmployeesDepartmentListVO {
	private String employeeId; 
	private String firstName;
	private List<Department> department; 
}
