package board.data.controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.reboard.BoardDaoInter;

@Controller
public class BoardDeleteController {

	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/deletepassform")
	public ModelAndView goDelete(
			@RequestParam String num,
			@RequestParam String currentPage) {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("num",num);
		mv.addObject("currentPage",currentPage);
		
		mv.setViewName("/reboard/delPassForm");
		return mv;
	}
	
	@PostMapping("/board/delpass")
	public String deletepass(
			@RequestParam(name="num") int num,
			@RequestParam(name="pass") int pass,
			@RequestParam(name="currentPage") int currentPage,
			HttpSession session
			) {
		
		int check = dao.getCheckPass(num, pass);
		
		if(check==1) {
			
			String photo = dao.getData(num).getPhoto();
			if(!photo.equals("no")) {
				String[] fNames = photo.split(",");
				String path = session.getServletContext().getRealPath("/WEB-INF/photo");
				
				for(String f:fNames) {
					File file= new File(path+"\\"+f);
					file.delete();
				}
			}
			dao.deleteForm(num);
			return "redirect:list?currentPage="+currentPage; 
			
		} else {
			return "reboard/passFail";
		}
	}
	
	
}
