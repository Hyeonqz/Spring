package spring.mvc.kyu;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.data.FormDto;

@Controller
public class FormController {
	
	@GetMapping("/data/myform")
	public String myform() {
		return "myform";
	}
	
	
	//read1 _ get방식
	@GetMapping("/data/read1")
	public ModelAndView read1(String myname, int myage, @RequestParam(value="msg", defaultValue = "HappyDay~!~!") String msg) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myname); //myname값을 name으로 저장한다, 불러올때 name으로 불러옴
		mv.addObject("age",myage);
		mv.addObject("msg",msg);
		
		//forward
		mv.setViewName("Process1");  
		return mv;
	}
	
	
	//post방식 _ dto로 입력
	@PostMapping("/data/read2")
	public ModelAndView read2(@ModelAttribute FormDto dto) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("dto",dto);

		mv.setViewName("Process2");
		return mv;
	}
	
	//map방식
	@PostMapping("/data/read3")
	public ModelAndView read3(@RequestParam Map<String,String> map) {
		ModelAndView mv = new ModelAndView();
		
		String sang = map.get("sang");
		String price = map.get("price");
		
		String data = sang + "의 가격은 : " + price + " 입니다";
		
		mv.addObject("data",data);
		mv.setViewName("Process3");
		return mv;
	}
	
	
	

}
