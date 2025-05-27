package com.yedam.app.work03.model;

import java.sql.Date;



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
	private Date	regdate;
	private Date updatedate; 
}
