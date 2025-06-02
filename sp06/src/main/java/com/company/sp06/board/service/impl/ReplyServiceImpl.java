package com.company.sp06.board.service.impl;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.sp06.board.mapper.ReplyMapper;
import com.company.sp06.board.service.Criteria;
import com.company.sp06.board.service.ReplyPageDTO;
import com.company.sp06.board.service.ReplyService;
import com.company.sp06.board.service.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService {
  private ReplyMapper mapper;
  @Override
  public int register(ReplyVO vo) {
    return mapper.insert(vo);

  }
  @Override
  public List<ReplyVO> getList(Criteria cri, int bno) {
    return mapper.getList(cri, bno);
  }
  
  @Override
  public ReplyPageDTO getListPage(Criteria cri, int bno) {       
    return new ReplyPageDTO(
        mapper.getCountByBno(bno), 
        mapper.getList(cri, bno));
  }
  
}
