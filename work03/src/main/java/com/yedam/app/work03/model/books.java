package com.yedam.app.work03.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class books {

	private int boardNo; 
	private String title;
	private String content; 
	private String writer;
	private String writeDate; 
	private int viewCnt;
	
}
