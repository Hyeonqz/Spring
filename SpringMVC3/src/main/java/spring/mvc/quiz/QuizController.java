package spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuizController {
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("ilike/movie")
	public String result1(Model model) {
		model.addAttribute("subject","���˵���");
		
		return "result1";
	}
	

	@GetMapping("school/myinfo")
	public ModelAndView result2() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("name","������");
		mv.addObject("shcool","�ֿ��");
		mv.addObject("grade","4");
		mv.addObject("addr","����");
		
		mv.setViewName("result2");
		
		return mv;
	}
	
	@PostMapping("shopipgo")
	public ModelAndView result3() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("result3");
		return mv;
	}
	
	
	@PostMapping("mysinsang")
	public ModelAndView result4() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result4");
		return mv;

	}
	
	
	
	
	
}
