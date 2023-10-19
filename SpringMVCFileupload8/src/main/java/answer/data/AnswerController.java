package answer.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnswerController {
	
	@Autowired
	AnswerDao adao;
	
	@PostMapping("/board/ainsert")
	public String answerinsert(
			@ModelAttribute AnswerDto dto,
			@RequestParam(value="", defaultValue="currentPage") int currentPage) {
		
		adao.insertAnswer(dto);
		
		return "redirect:content?num="+dto.getNum()+"&currentPage="+currentPage;
	}
	
}
