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
		
			model.addAttribute("hi","�ȳ� ���ϳ�");
			model.addAttribute("hungry","�����");
		
		return "quiz2";
	}
	
	@GetMapping("/")
	public String quiz3(Model model) {
		
		model.addAttribute("name","����");
		model.addAttribute("age","25��");
		model.addAttribute("addr","�����");
		
		
		return "quiz3";
	}


}
