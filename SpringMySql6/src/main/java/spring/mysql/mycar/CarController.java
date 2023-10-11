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
	//�ڵ�����, �̾ȿ� �޼��� ȣ���ϱ� ���ؼ� �ϴ°�.
	
	@GetMapping("kakao/list")
	public String kakao(Model model) {
		
		//dao�κ��� �� ���� ��������
		int totalCount = dao.getTotalCount();
		
		//��ϰ�������
		List<MyCarDto> list=dao.getAllCarData();
		
		//request�� ����
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
	
	@PostMapping("kakao/write") //�����ּ�
	public String write1(@ModelAttribute("dto") MyCarDto dto) {
		
		dao.insertCar(dto);
		
		return "redirect:list"; //list�� �̹� �����Ƿ�, �̷������� ȣ��
	}
	
	@GetMapping("kakao/deleteform") //������ ��� ����
	public String deleteform(@ModelAttribute("dto") MyCarDto dto) {
		
		dao.deleteCar(dto);
		
		return "redirect:list"; //list�� �̹� �����Ƿ�, �̷������� ȣ��
	}
	
	
	
	
	
	
	
	
	
	
}
