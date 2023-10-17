package board.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.reboard.BoardDaoInter;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardListController {
	
	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/list")
	public ModelAndView goreboard(
			@RequestParam(value="currentPage",defaultValue = "1") int currentPage) {
		ModelAndView mv= new ModelAndView();
		
		int totalCount = dao.getTotalCount();
		
		//페이징 처리 필요한 변수 선언
		int totalPage; //총 페이지수
		int startPage; //각블럭에서 보여질 시작페이지
		int endPage; //각블럭에서 보여질 끝페이지
		int startNum; //db에서 가져올 글의 시작번호(mysql은 첫글이 0,오라클은 1)
		int perPage=6; //한페이지당 보여질 글의 갯수
		int perBlock=10; //한블럭당 보여질 페이지 개수

		//현재페이지 읽기(단 null일경우는 1페이로 준다)계산을 해야하므로 int로 형변환해줌
		//if(("currentPage")==null)
		 //	currentPage=1;
		//else
			//currentPage=Integer.parseInt(("currentPage"));
		     
		     
		//총페이지수 구하기
		//총글의 갯수/한페이지당 보여질 개수로 나눔(7/5=1)
		//나머지가 1이라도 있으면 무조건 1페이지 추가(1+1=2페이지가 필요)
		totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);
		 
		//각블럭당 보여야할 시작페이지
		//perBlock=5일경우는 현재페이지 1~5 시작:1 끝:5
		//현재페이지 13  시작:11  끝:15
		startPage=(currentPage-1)/perBlock*perBlock+1;
		     
		endPage=startPage+perBlock-1;
		    
		 // 총페이지가 23일경우 마지막블럭은 25가아니라 23이다   
		     if(endPage>totalPage)
		        	endPage=totalPage;
		     
			//각페이지에서 보여질 시작번호
			//1페이지: 0,2페이지:5 3페이지:10....
			startNum=(currentPage-1)*perPage;
			
		
			//각 페이지에서 필요한 게시글 가져오기 == 보여질 글만 가져오기
			//각페이지당 출력할 시작번호 구하기 no
			//총글개수가 23이면 1페이지 23,2페이지는 18,3페이지 13.....
			//출력시 1씩 감소하며 출력	
			List<BoardDto> list = dao.getPagingList(startNum, perPage);

			//각 페이지에 출력할 시작번호
			int no = totalCount-(currentPage-1)*perPage;
		
		mv.addObject("totalCount",totalCount);
		mv.addObject("list",list);
		mv.addObject("startPage",startPage);
		mv.addObject("totalPage",totalPage);
		mv.addObject("endPage",endPage);
		mv.addObject("no",no);
		mv.addObject("currentPage",currentPage);
		
		mv.setViewName("reboard/boardList");
		
		return mv;
	}
}
