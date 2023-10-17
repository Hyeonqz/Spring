package board.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.reboard.BoardDaoInter;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardContentController {
	
	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/content")
	public ModelAndView goContent(@RequestParam int num, @RequestParam int currentPage) {
		ModelAndView mav = new ModelAndView();
		
		//조회수 증가
		dao.updateReadcount(num);
		
		BoardDto dto = dao.getData(num);
		
		mav.addObject("dto",dto);
		mav.addObject("currentPage",currentPage);
		
		mav.setViewName("reboard/content");
		return mav;
	}
	
	@GetMapping("/board/writeform1")
	public String godabgul() {
		return "reboard/writeForm";
	}
	
	
}
