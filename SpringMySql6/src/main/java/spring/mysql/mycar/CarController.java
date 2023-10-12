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
	//�ڵ�����, �̾ȿ� �޼��� ȣ���ϱ� ���ؼ� �ϴ°�. MyCarDao �ȿ��ִ� �޼��� �� ��밡��.
	
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
	
	@PostMapping("kakao/write") //�����ּ�
	public String write1(@ModelAttribute("dto") MyCarDto dto) {
		
		dao.insertCar(dto);
		
		return "redirect:list"; //list�� �̹� �����Ƿ�, �̷������� ȣ��
	}
	
	@GetMapping("kakao/deleteform") //������ ��� ����
	public String deleteform(@RequestParam String num) {
		
		dao.deleteCar(num);
		
		return "redirect:list"; //list�� �̹� �����Ƿ�, �̷������� ȣ��
	}
	
	@GetMapping("kakao/updateform")
	public String goUpdate(String num, Model model) {
		
		MyCarDto dto = dao.getData(num);
		
		model.addAttribute("dto",dto); //model�� ���ؼ� dto ������ �Ѱ��ش�.
		
		return "car/updateForm";
	}
	
	@PostMapping("kakao/update")
	public String updateList(@ModelAttribute MyCarDto dto) {
		dao.update(dto);
		
		return "redirect:list"; 
	}
	
	
	
	
	
	
	
	
}
