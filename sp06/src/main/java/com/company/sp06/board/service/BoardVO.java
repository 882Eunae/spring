package com.company.sp06.board.service;

import java.sql.Date;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class BoardVO {
	private int bno; 
	private String title;
	private String	content; 
	private String	writer;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate regDate;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate updateDate;
}
