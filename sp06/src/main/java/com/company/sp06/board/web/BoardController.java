package com.company.sp06.board.web;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.sp06.board.service.BoardService;
import com.company.sp06.board.service.BoardVO;
import com.company.sp06.board.service.Criteria;
import com.company.sp06.common.PageDTO;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 게시글 관리   
 *작성일자      작성자  수정내용 
 *20250525   홍길동   최초작성
 *20250525   홍길동   파이팅 
 * */
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
	final BoardService boardService; 
    private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	/**
	 * 게시글조회 
	 * 게시글 목록  
	 * @param model : 검색어 검색조건 
	 * @return 목록페이지명 
	 */
	@GetMapping("/list")
	public String getMethodName(Model model,Criteria cri) {
		model.addAttribute("list",boardService.findAll(cri)); 
		
		long total = boardService.getCount(cri);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		
		return "board/list" ; 
	}
	

	//등록 페이지로 이동 
	@GetMapping("/register")
	public String register() {			
			//	System.out.println("등록됨");
				return "board/register"; 
	}
	//등록후 다시 list 페이지로 이동 
	@PostMapping("register")
	public String register(BoardVO board,RedirectAttributes rttr) {
				boardService.insert(board); 
			//	System.out.println("등록됨");
				rttr.addFlashAttribute("result",board.getBno()); 
				return "redirect:list"; 
	}
	
	//단건조회 전체페이지 -> 버튼 클릭시 이동  
//	@GetMapping("get")
//	public String get(@RequestParam("bno") int bno,Model model) {
//		model.addAttribute("board",boardService.findByBno(bno)); 
//		return "board/get"; 
//	}
//	
	
	
	//수정페이지이동
//    @GetMapping("/modify")
//    public String updatePage(@RequestParam("bno") int bno,Model model) {
//    	model.addAttribute("board",boardService.findByBno(bno)); 
//    	
//    	return "board/put"; 
//    }
	
	@GetMapping({ "/get", "/modify" })
	public void get(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) {

	//	log().info("/get or modify");
		model.addAttribute("board", boardService.findByBno(bno));
	}
	
//    @PostMapping("modify")
//    public String update(@RequestParam("bno") int bno,RedirectAttributes rttr) {
//    	BoardVO bvo=new BoardVO();
//    	bvo.setBno(bno);  
//    	boardService.updateTitle(bvo); 
//    	rttr.addAttribute("bno",bvo.getBno()); 
//    	return "redirect:list"; 
//    }
	@PostMapping("/modify")
	public String modify(BoardVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		//log.info("modify:" + board);

//		if (boardService.updateTitle(board)>=0) {
//			rttr.addFlashAttribute("result", "success");
//		}
		   log.info("==== 요청된 BoardVO 데이터 ====");
		    log.info("bno: " + board.getBno());
		    log.info("title: " + board.getTitle());
		    log.info("content: " + board.getContent());
		    log.info("writer: " + board.getWriter());
		    log.info("regDate: " + board.getRegDate());
		    log.info("updateDate: " + board.getUpdateDate());

		    log.info("==== 요청된 Criteria 데이터 ====");
		    log.info("pageNum: " + cri.getPageNum());
		    log.info("amount: " + cri.getAmount());
		    log.info("type: " + cri.getType());
		    log.info("keyword: " + cri.getKeyword());

		boardService.updateTitle(board); 
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());

		return "redirect:/board/list";
	}
	
	
	//삭제처리 
	@PostMapping("/remove")
	public String delete(@RequestParam("bno") int bno) {
		BoardVO bvo=new BoardVO();
    	bvo.setBno(bno);
		boardService.delete(bvo);
		return "redirect:list"; //상대경로 	
	}
	
	
}
