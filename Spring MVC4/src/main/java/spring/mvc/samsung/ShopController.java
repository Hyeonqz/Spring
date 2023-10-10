package spring.mvc.samsung;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.data.dto.ShopDto;

@Controller
public class ShopController {
	
	@GetMapping("/shop/list")
	public String result3() {
		
		return "shop/list";
		
	}
	
	@GetMapping("/shop/form2")
	public String form2() {
		return "shop/shopForm";
	}
	
	//#1
	/*
	 * @PostMapping("/shop/process2") public ModelAndView shopResult(ShopDto dto) {
	 * ModelAndView modelandView = new ModelAndView();
	 * modelandView.addObject("dto",dto);
	 * 
	 * modelandView.setViewName("shop/shopResult"); 
	 * return modelandView; 
	 * }
	 */
	
	//#2
	@PostMapping("/shop/process2")
	public String process2(@ModelAttribute ShopDto dto) { //클래스 중에 맨 앞글자만 소문자가 됨.
		
		return "shop/shopResult";
		
	}
	
	@GetMapping("/shop/form3")
	public String form3() {
		return "shop/mapForm";
	}
	
	@PostMapping("/shop/process3")
	public ModelAndView process(@RequestParam Map<String,String> map) {
		ModelAndView modelAndView = new ModelAndView();
		
		String name = map.get("name");
		String java = map.get("java");
		String spring = map.get("spring");
		String sql = map.get("sql");
		String sum = java + spring + sql;
		
		modelAndView.addObject("name",name);
		modelAndView.addObject("java",java);
		modelAndView.addObject("spring",spring);
		modelAndView.addObject("sql",sql);
		modelAndView.addObject("sum",sum);
		
		modelAndView.setViewName("shop/mapResult");
		
		return modelAndView;
	}


}
