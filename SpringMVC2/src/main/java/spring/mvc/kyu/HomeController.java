package spring.mvc.kyu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*컨트롤러 만들시 순서
1.bean에 등록을 한다 -> @Controller
2.메서드를 하나 만든다 만들때 Getmapping 경로 설정 필수!!
3.Getmapping("/") 의미 : /은 root를 의미함 맨처음 url에 나오는 절대경로를 말한다.
*
*/

@Controller
public class HomeController {

	@GetMapping("/")
	public String start() {

		return "start";
	}

	
	 @GetMapping("/login/form") 
	 public String form() {
	  
	  return "form"; 
	  }
	  
	  @GetMapping("/login/read") 
	  public String process(Model model, @RequestParam(value="myid") String id , @RequestParam(value="mypass") String pass) {
	  
	  model.addAttribute("id",id); 
	  model.addAttribute("pass",pass);
	  
	  String msg="";
	  
	  if(pass.equals("1234")) { msg = "로그인 성공"; } else { msg="로그인 실패"; }
	  
	  model.addAttribute("msg",msg); //model.addattribute ("변수명",html에서 불러올 값.);
	  			//ex) m.addattribute("name","진") name값을 호출하면 진 이 나온다.
	  
	  return "result";
	  
	  }
	 

}
