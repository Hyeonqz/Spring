package board.data.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.reboard.BoardDaoInter;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardUpdateController {
	
	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/updatepassform")
	public ModelAndView goUpdate(
			@RequestParam String num,
			@RequestParam String currentPage) {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("num",num);
		mv.addObject("currentPage",currentPage);
		
		mv.setViewName("/reboard/updatePassForm");
		return mv;
	}
		
	@PostMapping("/board/updatepass")
	public ModelAndView updatepass(
			@RequestParam int num,
			@RequestParam int pass,
			@RequestParam int currentPage) {
		
		ModelAndView mv = new ModelAndView(); 
		
		int check = dao.getCheckPass(num, pass);
		
		if(check==1) {
			
			BoardDto dto = dao.getData(num);
			
			mv.addObject("currentPage",currentPage);
			mv.addObject("dto",dto);
			
			mv.setViewName("/reboard/updateForm"); 
		} else {
			mv.setViewName("/reboard/passFail");
		}
		
		return mv;
	}
	
	@PostMapping("/board/update")
	public ModelAndView update(@ModelAttribute BoardDto dto,
			@RequestParam String currentPage,
			@RequestParam ArrayList<MultipartFile> uimage,
			HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		
		//실제경로
		String path = session.getServletContext().getRealPath("/WEB-INF/photo");
		System.out.println(path);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String photo = "";
		
		if(uimage.get(0).getOriginalFilename().equals("")) {
			photo = "no";
		} else {
			for(MultipartFile f :uimage) {
				String fName = sdf.format(new Date())+f.getOriginalFilename();
				photo += fName + ",";
				
				try {
					f.transferTo(new File(path+"\\"+fName));
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			//photo에서 마지막 컴마 제거.
			photo = photo.substring(0,photo.length()-1); 
		}
		
		//dto의 photo에 업로드한 photoname을넣어주기
		dto.setPhoto(photo);
		
		dao.updateform(dto);
		
		mv.addObject("dto",dto);
		
		mv.setViewName("redirect:content?num="+dto.getNum()+"&currentPage="+currentPage);
		return mv;
	}
}
