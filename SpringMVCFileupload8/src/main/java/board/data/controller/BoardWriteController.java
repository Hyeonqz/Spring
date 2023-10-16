package board.data.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import spring.mvc.reboard.BoardDaoInter;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardWriteController {
	
	@Autowired
	BoardDaoInter dao;

	@GetMapping("board/writeform")
	public String write(Model model, @RequestParam Map<String,String> map) {

		String currentPage = map.get("currentPage");
		String num = map.get("num");
		String regroup = map.get("regroup");
		String restep = map.get("restep");
		String relevel = map.get("relevel");
		
		System.out.println(currentPage);
		System.out.println(num);
		System.out.println(regroup + " _ " + restep + " _ " + relevel);
		
		//입력 폼에 hidden으로 이 값들을 넘겨 줘야 한다. 
		model.addAttribute("currentPage",currentPage==null?"1":currentPage);
		model.addAttribute("num",num==null?"0":num);
		model.addAttribute("regroup",regroup==null?"0":regroup);
		model.addAttribute("restep",restep==null?"0":restep);
		model.addAttribute("relevel",relevel==null?"0":relevel);
		
		//0으로 넣어야 dao에서 새글로 인식 한다.
		//폼이 답글,새글 공용이므로
	
		model.addAttribute("map",map);
		
		return "reboard/writeForm";
	}
	
	
	@PostMapping("/board/insert")
	public String insert(@ModelAttribute BoardDto dto,
			@RequestParam ArrayList<MultipartFile> uimage,
			HttpSession session) {
		
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
		
		dto.setPhoto(photo);
		
		dao.insertReboard(dto);
		
		
		return "redirect:list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
