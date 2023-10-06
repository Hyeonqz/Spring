package spring.mvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {
	
	
	@GetMapping("/happy")
	public String quiz1() {
		
		return "quiz1";
	}
	
	@GetMapping("/hello")
	public String quiz2(Model model) {
		
			model.addAttribute("hi","안녕 뭐하냐");
			model.addAttribute("hungry","배고파");
		
		return "quiz2";
	}
	
	@GetMapping("/")
	public String quiz3(Model model) {
		
		model.addAttribute("name","현규");
		model.addAttribute("age","25살");
		model.addAttribute("addr","오산시");
		
		
		return "quiz3";
	}


}
