package com.example.demo.emp.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.EmpService;
import com.example.demo.emp.vo.EmpVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmpServiceImpl implements EmpService {
            final EmpMapper empMapper;

			@Override
			public List<EmpVO> getEmpList() {
				return empMapper.getEmpList();
			} 
            
            
            
 }
