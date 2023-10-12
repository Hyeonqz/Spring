package spring.mvc.carmember;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mysql.mycar.MyCarDto;


@Controller
public class CarMemberController {

	@Autowired
	CarMemberInter inter;
	
	@GetMapping("/car/list")
	public String memberStart(Model model) {
		
		//���� ��������
		int count = inter.getTotalCount();
		List<CarMemberDto> list = inter.getListData();
		
		//request�� ����
		model.addAttribute("count1",count);
		model.addAttribute("list",list);
		
		return "carmember/memberList";
	}
	
	//�� ����
	@GetMapping("/car/addform")
	public String addform() {
		return "carmember/addForm";
	}
	
	@GetMapping("/car/deleteform")
	public String delete(@RequestParam String num) {
		inter.delete(num);
		return "redirect:list";
	}
	
	
	  @PostMapping("/car/add") 
	  public String insert(@ModelAttribute CarMemberDto cdto) {
	  
	  inter.insert(cdto);
	  
	  return "redirect:list"; 
	  }
	 
	  
	 @GetMapping("car/update1")
	 public String updateGo(String num, Model model) {
	  
	  CarMemberDto cdto = inter.getNum(num);
	  
	  model.addAttribute("cdto",cdto); //model�� ���ؼ� dto ������ �Ѱ��ش�.
	  
	  return "carmember/updateForm"; 
	  }
	 
	 @PostMapping("/car/update2")
	 public String update(@ModelAttribute CarMemberDto cdto) {
		 
		 inter.update(cdto);
		 
		 return "redirect:list"; 
	 }
	 
	
	
}
