package com.example.demo.emp.mapper;

import java.util.List;

import com.example.demo.emp.vo.EmpVO;

public interface EmpMapper {
    public EmpVO getEmp(EmpVO empVO);
    public List<EmpVO> getEmpList();
    public void empInsert(EmpVO empVO);
 }
