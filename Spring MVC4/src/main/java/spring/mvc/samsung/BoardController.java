package spring.mvc.samsung;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {

	//�������� ���� �������� �� ���� String�� ��.
	//GetMapping�� Ŭ������ �����Ѵ�
	
	@GetMapping("/form1")
	public String redirectForm() {
		return "board/writeform";
	}
	
	@PostMapping("/process")
	public ModelAndView process(String name, String date, int age, String gender,
			@RequestParam(defaultValue = "�ູ�� �Ϸ� �ǽʼ�~~") String str , 
			@RequestParam(required = false) String msg,
			@RequestParam(defaultValue = "1") int currentPage) { 
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("name",name);
		modelAndView.addObject("date",date);
		modelAndView.addObject("age",age);
		modelAndView.addObject("gender",gender);
		modelAndView.addObject("str",str);
		modelAndView.addObject("msg",msg);		
		modelAndView.addObject("currentPage",currentPage);
		
		modelAndView.setViewName("board/result");
		
		return modelAndView;
	}
	
	
	@GetMapping("/result2")
	public String result2(Model model) {
		model.addAttribute("myimg1","../image/q9.JPG");
		model.addAttribute("title","�����ϴ� ������?");
		return "board/result2";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
