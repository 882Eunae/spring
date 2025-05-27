package com.yedam.app.sp04.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class SearchVO extends Employees {
	int page;
	List<Integer> ids;
	
}
