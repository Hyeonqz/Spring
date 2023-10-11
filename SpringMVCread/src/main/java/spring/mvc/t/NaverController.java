package spring.mvc.t;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import spring.data.dto.shopDto;

@Controller
@RequestMapping("/naver")
public class NaverController {
	
	@GetMapping("/form1")
	public String a() {
		return "day1010/form1";
	}
	
	@PostMapping("/read1")
	public ModelAndView read1(
			@RequestParam String name, 
			@RequestParam String addr, 
			@RequestParam String gender) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("name",name);
		modelAndView.addObject("addr",addr);
		modelAndView.addObject("gender",gender);
		
		modelAndView.setViewName("day1010/result1");
		return modelAndView;
	}
	
	@GetMapping("/form2")
	public String b() {
		return "day1010/form2";
	}
	
	@PostMapping("/read2")
	public String read2(@ModelAttribute shopDto dto) {
		return "day1010/result2";
	}
	
	@GetMapping("/form3")
	public String c() {
		return "day1010/form3";
	}
	
	@PostMapping("/read3")
	//���±��� name��key������ , �Է°��� value <key,value>==<���±׳���,�Է°�>
	public ModelAndView read3(@RequestParam Map<String,String> map) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("sang", map.get("sang"));
		mav.addObject("color", map.get("color"));
		mav.addObject("price", map.get("price"));
		mav.addObject("image", map.get("image"));
		
		mav.setViewName("day1010/result3");
		return mav;
	}
	
	@GetMapping("/form4")
	public String form4() {
		
		return "upload/uploadForm1";
	}
	
	@PostMapping("/upload1")
	public ModelAndView read1(
			@RequestParam String title,
			@RequestParam MultipartFile photo,
			HttpSession request) { //������α��ϱ�
		
		ModelAndView mv = new ModelAndView();
		
		//���ε� �� ������� ���ϱ�
		String path= request.getServletContext().getRealPath("/WEB-INF/image");
		
		//���ε�� ���ϸ�
		String fileName=photo.getOriginalFilename(); 
		
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyymmddHHss");
		fileName = sdf.format(new Date())+"_"+fileName;
		
		if(!fileName.equals("")) {
			
			fileName = sdf.format(new Date())+"_"+fileName;
			
			try {
				photo.transferTo(new File(path+"\\"+fileName));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else { //���ε���� ���
			fileName="no";
		}
		
		//path�� ���ε��ϱ�.
		try {
			photo.transferTo(new File(path+"\\"+fileName));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		mv.addObject("fileName",fileName);
		mv.addObject("path",path);
		mv.addObject("title",title);
		mv.addObject("photo",photo);
		
		mv.setViewName("upload/uploadResult1");
		return mv;
	}
	
	
	@GetMapping("/uploadForm2")
	public String uploadform5() {
		
		return "upload/uploadForm2";
	}
	
	@PostMapping("/upload2")
	public ModelAndView read2(@RequestParam String title,
			@RequestParam ArrayList<MultipartFile> photo,
			HttpSession session) {
		
		ModelAndView model=new ModelAndView();
		
		//�Էε� �� ���� ��� ���ϱ�
		String path=session.getServletContext().getRealPath("/WEB-INF/image");

		//���� ��¥�� �ð��� �̿��ؼ� ���ϸ� ����
		SimpleDateFormat sdf=new SimpleDateFormat("yyyymmddHHss");
		
		ArrayList<String> files=new ArrayList<String>();
		
		//���ϸ���
		for(MultipartFile f:photo)
		{
			String fileName=sdf.format(new Date())+"_"+f.getOriginalFilename();
			files.add(fileName);
			
			//���ε�
			try {
				f.transferTo(new File(path+"\\"+fileName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		model.addObject("files", files);
		model.addObject("title", title);
		model.addObject("path", path);
		
		model.setViewName("upload/uploadResult2");
		
		return model;
	}
	
	
	
	
	
	
	
	
}
