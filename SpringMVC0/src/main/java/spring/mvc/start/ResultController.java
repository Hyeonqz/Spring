package spring.mvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	
	@GetMapping("/apple/list")
	public String result1(Model model) {
		
		model.addAttribute("myname","������");
		model.addAttribute("number","1234");
		
		return "result1";
	}
	
	@GetMapping("/banana/insert")
	public ModelAndView fruit() {
		
		//ModelAndview�� request�� �����ϱ� ���� model�� 
		//������ �ϱ����� view�� ���ĳ��� Ŭ���� �Դϴ�.
		ModelAndView mview = new ModelAndView();
		
		//request�� ����
		mview.addObject("java",90);
		mview.addObject("sql","100��");
		mview.addObject("spring",100);
		
		//������ �� jsp���� ����
		mview.setViewName("result2");
		
		return mview;
		
	}
	
	@GetMapping("/orange/delete")
	public ModelAndView orange() {
		
		ModelAndView mview = new ModelAndView();
		mview.addObject("sangpum","������");
		mview.addObject("price",10000);
		mview.addObject("color","orange");
		
		mview.setViewName("result3");
		
		return mview;
	}
	
	@GetMapping("/orange/delete1")
	public String result3(Model model) {
		
		model.addAttribute("sangpum1","������");
		model.addAttribute("����","100����");
		model.addAttribute("color1","������");
		
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
