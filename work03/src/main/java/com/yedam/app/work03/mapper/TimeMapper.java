package com.yedam.app.work03.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("select sysdate from dual")
	public String getTime(); 
	public String getTime2(); 

}
