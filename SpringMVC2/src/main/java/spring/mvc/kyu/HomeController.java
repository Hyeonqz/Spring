package spring.mvc.kyu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*��Ʈ�ѷ� ����� ����
1.bean�� ����� �Ѵ� -> @Controller
2.�޼��带 �ϳ� ����� ���鶧 Getmapping ��� ���� �ʼ�!!
3.Getmapping("/") �ǹ� : /�� root�� �ǹ��� ��ó�� url�� ������ �����θ� ���Ѵ�.
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
	  
	  if(pass.equals("1234")) { msg = "�α��� ����"; } else { msg="�α��� ����"; }
	  
	  model.addAttribute("msg",msg); //model.addattribute ("������",html���� �ҷ��� ��.);
	  			//ex) m.addattribute("name","��") name���� ȣ���ϸ� �� �� ���´�.
	  
	  return "result";
	  
	  }
	 

}
