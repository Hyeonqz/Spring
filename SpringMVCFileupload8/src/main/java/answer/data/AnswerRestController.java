package answer.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.mvc.reboard.BoardDaoInter;

@RestController
public class AnswerRestController {
	
	@Autowired
	AnswerDao adao;
	
	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/adelete")
	public Map<String,Integer> deleteAnswer(
			@RequestParam int idx,
			@RequestParam String pass) {
		
		int check = adao.getCheckPass(idx, pass);

		if(check==1) {
			adao.deleteAnswer(idx);
		} 
		
		Map<String,Integer> map =  new HashMap<String,Integer>();
		map.put("check", check);
		
		return map;
	}

}
