package com.yedam.board.service;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
  private Long rno;
  private int bno; //tbl_board의 bno가 int 타입이라 이렇게 지정함 
  private String reply;
  private String replyer;
  private Date replyDate;
  private Date updateDate;
}