package spring.mysql.mycar;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
	
	@Autowired
	MyCarDao dao;
	//자동주입, 이안에 메서드 호출하기 위해서 하는것.
	
	@GetMapping("kakao/list")
	public String kakao(Model model) {
		
		//dao로부터 총 개수 가져오기
		int totalCount = dao.getTotalCount();
		
		//목록가져오기
		List<MyCarDto> list=dao.getAllCarData();
		
		//request에 저장
		model.addAttribute("totalCount",totalCount);
		model.addAttribute("list",list);
		
		return "car/carlist";
	}
	
	@GetMapping("kakao/writeform")
	public String writeform() {
		return "car/writeform";
	}
	
	/*
	 * @PostMapping("/write") public ModelAndView write(
	 * 
	 * @RequestParam String name,
	 * 
	 * @RequestParam String price,
	 * 
	 * @RequestParam String color,
	 * 
	 * @RequestParam String guip) {
	 * 
	 * ModelAndView modelAndView = new ModelAndView();
	 * 
	 * modelAndView.addObject("carname", name); modelAndView.addObject("carprice",
	 * price); modelAndView.addObject("carcolor", color);
	 * modelAndView.addObject("carguip", guip);
	 * 
	 * modelAndView.setViewName("car/carlist");
	 * 
	 * return modelAndView; }
	 */
	
	@PostMapping("kakao/write") //가는주소
	public String write1(@ModelAttribute("dto") MyCarDto dto) {
		
		dao.insertCar(dto);
		
		return "redirect:list"; //list가 이미 있으므로, 이런식으로 호출
	}
	
	@GetMapping("kakao/deleteform") //가상경로 라고 생각
	public String deleteform(@ModelAttribute("dto") MyCarDto dto) {
		
		dao.deleteCar(dto);
		
		return "redirect:list"; //list가 이미 있으므로, 이런식으로 호출
	}
	
	
	
	
	
	
	
	
	
	
}
