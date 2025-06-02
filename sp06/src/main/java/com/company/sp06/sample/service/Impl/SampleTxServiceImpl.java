package com.company.sp06.sample.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.sp06.sample.mapper.Sample1Mapper;

import com.company.sp06.sample.mapper.Sample2Mapper;
import com.company.sp06.sample.service.SampleTxService;


import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class SampleTxServiceImpl implements SampleTxService {

	private final Sample1Mapper sample1Mapper; 
	private final Sample2Mapper sample2Mapper; 
	@Transactional
	@Override
	public void addData(String value) {
		// TODO Auto-generated method stub
		sample1Mapper.insertCol1(value); //500 둘중하나라도 에러나면... 
		sample2Mapper.insertCol2(value); //10 
	}

}
