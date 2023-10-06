package spring.mvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	
	@GetMapping("/apple/list")
	public String result1(Model model) {
		
		model.addAttribute("myname","진현규");
		model.addAttribute("number","1234");
		
		return "result1";
	}
	
	@GetMapping("/banana/insert")
	public ModelAndView fruit() {
		
		//ModelAndview는 request에 저장하기 위한 model과 
		//포워드 하기위한 view를 합쳐놓은 클래스 입니다.
		ModelAndView mview = new ModelAndView();
		
		//request에 저장
		mview.addObject("java",90);
		mview.addObject("sql","100점");
		mview.addObject("spring",100);
		
		//포워드 할 jsp파일 지정
		mview.setViewName("result2");
		
		return mview;
		
	}
	
	@GetMapping("/orange/delete")
	public ModelAndView orange() {
		
		ModelAndView mview = new ModelAndView();
		mview.addObject("sangpum","오렌지");
		mview.addObject("price",10000);
		mview.addObject("color","orange");
		
		mview.setViewName("result3");
		
		return mview;
	}
	
	@GetMapping("/orange/delete1")
	public String result3(Model model) {
		
		model.addAttribute("sangpum1","오렌지");
		model.addAttribute("가격","100만원");
		model.addAttribute("color1","오렌지");
		
		return "result3";
	}
	
	@GetMapping("/shop/detail")
	public String resImage() {
		
		return "result4";
	}
	
	@GetMapping("/board/insert/data")
	public String res() {
		
		return "result5";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
