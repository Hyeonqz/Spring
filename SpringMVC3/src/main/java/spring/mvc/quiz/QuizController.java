package spring.mvc.quiz;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.dto.DataDto;

@Controller
public class QuizController {
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("ilike/movie")
	public String result1(Model model) {
		model.addAttribute("subject","범죄도시");
		
		return "result1";	
	}
	

	@GetMapping("/school/myinfo")
	public ModelAndView result2() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result2");
			
		return mv;
	}
	
	@GetMapping("/data/res2")
	public ModelAndView myform2(String myname, String myschool, String mygrade, String myaddr, 
			@RequestParam(value="abc" , defaultValue = "안녕하세요~~") String abc) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myname);
		mv.addObject("school",myschool);
		mv.addObject("grade",mygrade);
		mv.addObject("saddr",myaddr);
		mv.addObject("abc",abc);
		
		mv.setViewName("myform2");
		return mv;
	}
	
	
	@GetMapping("/shop/ipgo")
	public ModelAndView result3() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("result3");
		return mv;
	}
	
	//dto사용해서 하기
	@PostMapping("/data/res3")
	public ModelAndView myform3(@ModelAttribute DataDto dto) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("dto",dto);
		
		mv.setViewName("myform3");
		return mv;
	}
	
	
	
	//map으로 시용하기
	@GetMapping("/mysinsang")
	public ModelAndView result4() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result4");
		return mv;
	}
	
	@PostMapping("/data/res4")
	public ModelAndView myform4(@RequestParam Map<String,String> map) {
		ModelAndView mv = new ModelAndView();
		
		String one = map.get("one");
		String two = map.get("two");
		String three = map.get("three");
		String four = map.get("four");
		
		String total = one + two + three + four;
		
		mv.addObject("total",total);
		mv.setViewName("myform4");
		return mv;
	}
	
	
	
	
	
	
}
