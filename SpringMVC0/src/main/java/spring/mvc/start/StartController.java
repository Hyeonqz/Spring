package spring.mvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//컨트롤로에서는 어노테이션 controller
//코드 작성전에 먼저 어노테이션한 후에 코드 작성한다.

@Controller
public class StartController {

	//start.jsp로 가기위한 메서드(포워드)
	@GetMapping("/")
	public String start(Model model) {
		
		model.addAttribute("name","진현규");
		model.addAttribute("addr","주소");
		
		return "start"; //WEB-INF/day1005/start.jsp를 의미한다.
	}
	
}
