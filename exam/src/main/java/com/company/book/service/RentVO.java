package com.company.book.service;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentVO {
    
	private int rentNo; 
	private int bookNo;
	private String bookName;
	private int sumPrice; 
	private int sumStatus; 
	private int rentPrice; 
    private Date rentDate; 
	private String rentStatus; 
	
}
