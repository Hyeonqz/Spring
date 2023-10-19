package board.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import answer.data.AnswerDao;
import answer.data.AnswerDto;
import spring.mvc.reboard.BoardDaoInter;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardContentController {
	
	@Autowired
	BoardDaoInter dao;
	
	@Autowired
	AnswerDao adao;
	
	@GetMapping("/board/content")
	public ModelAndView goContent(@RequestParam int num, @RequestParam int currentPage) {
		ModelAndView mav = new ModelAndView();
		
		//��ȸ�� ����
		dao.updateReadcount(num);
		//num�� �ش��ϴ� dto����
		BoardDto dto = dao.getData(num);
		
		//num�� �ش��ϴ� ����� db���� �����ͼ� ������
		List<AnswerDto> alist = adao.getAnswerList(num);
		
		//���� ���� ���� �Ѱܾ� ��
		mav.addObject("acount",alist.size());
		mav.addObject("alist",alist);
		
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
