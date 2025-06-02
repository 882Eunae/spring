package com.company.sp06.sample.service.Impl;

import org.springframework.stereotype.Service;

import com.company.sp06.sample.service.SampleService;
@Service
public class SampleServiceImpl implements SampleService{

	@Override
	public void sample(String name) {
		
		System.out.println("서비스");
	}
}
