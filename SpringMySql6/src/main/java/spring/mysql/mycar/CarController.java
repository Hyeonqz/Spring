package spring.mysql.mycar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
	
	@Autowired
	MyCarDao dao;
	//자동주입, 이안에 메서드 호출하기 위해서 하는것. MyCarDao 안에있는 메서드 다 사용가능.
	
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
	
	@PostMapping("kakao/write") //가는주소
	public String write1(@ModelAttribute("dto") MyCarDto dto) {
		
		dao.insertCar(dto);
		
		return "redirect:list"; //list가 이미 있으므로, 이런식으로 호출
	}
	
	@GetMapping("kakao/deleteform") //가상경로 라고 생각
	public String deleteform(@RequestParam String num) {
		
		dao.deleteCar(num);
		
		return "redirect:list"; //list가 이미 있으므로, 이런식으로 호출
	}
	
	@GetMapping("kakao/updateform")
	public String goUpdate(String num, Model model) {
		
		MyCarDto dto = dao.getData(num);
		
		model.addAttribute("dto",dto); //model을 통해서 dto 변수를 넘겨준다.
		
		return "car/updateForm";
	}
	
	@PostMapping("kakao/update")
	public String updateList(@ModelAttribute MyCarDto dto) {
		dao.update(dto);
		
		return "redirect:list"; 
	}
	
	
	
	
	
	
	
	
}
