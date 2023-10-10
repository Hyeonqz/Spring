package spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.dto.quizDto;

@Controller
public class QuizController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/info/form")
	public String info() {
		return "infoForm";
	}
	//#1
	/*
	 * @PostMapping("info/act") public ModelAndView infoform(quizDto dto) {
	 * ModelAndView mv= new ModelAndView();
	 * 
	 * mv.addObject("dto",dto);
	 * 
	 * mv.setViewName("/infoWrite"); return mv; }
	 */
	
	//#2
	@PostMapping("info/act")
	public String result(@ModelAttribute("dto") quizDto dto) {
		
		return "/infoWrite";
	}

}
