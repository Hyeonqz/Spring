package spring.mvc.t;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	//폼태그의 name이key값으로 , 입력값은 value <key,value>==<폼태그네임,입력값>
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
	public String d() {
		return "day1010/form4";
	}
}
