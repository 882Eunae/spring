package com.yedam.app.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.mapper.TimeMapper;
import com.yedam.app.service.TimeService;

@Service
public class TimeServiceImpl implements TimeService{

	@Autowired TimeMapper timeMapper;
	
	@Override
	public String getTime() {
		return timeMapper.getTime();
	}
	
	@Transactional
	@Override
	public String getTime2() {
		return timeMapper.getTime2();
	}

}
