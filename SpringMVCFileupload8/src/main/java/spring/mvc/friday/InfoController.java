package spring.mvc.friday;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InfoController {
	
	@Autowired
	InfoInter inter;
	
	@GetMapping("/info/list")
	public ModelAndView info1() {
		
		ModelAndView mv = new ModelAndView();
		
		int totalcount = inter.getTotalCount();
		List<InfoDto> list = inter.getAllInfos();
		
		mv.addObject("totalcount",totalcount);
		mv.addObject("list",list);
		
		mv.setViewName("info/infoList");
		
		return mv;
	}
	
	@GetMapping("info/addform")
	public String form() {
		return "info/addForm";
	}
	
	@GetMapping("info/goList")
	public String moklok() {
		return "redirect:list";
	}
	
	@GetMapping("/info/delete")
	public String goDelete() {
		return "redirect:list";
	}
	
	@GetMapping("info/uform")
	public String uform(@RequestParam String num , Model model) {
		
		InfoDto dto = inter.getNum(num);
		
		model.addAttribute("dto",dto);
		
		return "info/updateform";
	}
	
	@PostMapping("/info/update")
	public String updateform(
			@ModelAttribute InfoDto dto,
			@RequestParam MultipartFile upload,
			HttpSession session) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
		String path = session.getServletContext().getRealPath("/resources/image/");

		String photoname; //dto�� ���� ����
		
		//���� ���þ��� ��� null
		if(upload.getOriginalFilename().equals("")) {
			photoname=null;
		} else {
			photoname=upload.getOriginalFilename();
			photoname=sdf.format(new Date()) + "_"+photoname;
			
			//���ε�
			try {
				upload.transferTo(new File(path+"\\"+photoname));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//dto�� photo�� ���ε��� photoname���־��ֱ�
		dto.setPhoto(photoname);
		
		inter.updateMyInfo(dto);
		
		return "redirect:list";
	}
	
	@GetMapping("/info/deletego")
	public String delete(
			@RequestParam String num, HttpSession session) {
		
			String photo = inter.getNum(num).getPhoto();
			
			if(!photo.equals("no")) {
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
				String path = session.getServletContext().getRealPath("/resources/image/");
				
				File file = new File(path + "\\" +photo);
				file.delete();
			}
		
			inter.deleteMyInfo(num);
			
		return "redirect:list";
	}
	
	
	
	@PostMapping("/info/insert")
	public String insert(
			@ModelAttribute InfoDto dto,
			@RequestParam MultipartFile upload,
			HttpSession session) { //session�� realpath ������ �ִ� �� �̴�.
		
		String path = session.getServletContext().getRealPath("/resources/image/");
		System.out.println(path);
		
		SimpleDateFormat sdf=  new SimpleDateFormat("yyyyMMdd HHmmss");

		String photo = "";
		
		if(upload.getOriginalFilename().equals("")) {
			photo = "no";
		} else {
			String fName = upload.getOriginalFilename();
			fName = sdf.format(new Date()) + "_" + fName;
			photo=fName;
			
			//���ε�
			try {
				upload.transferTo(new File(path+"/"+photo));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//dto�� photo�� �ֱ�
		dto.setPhoto(photo);
		
		//insert
		inter.insertMyInfo(dto);
		
		return "redirect:list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
