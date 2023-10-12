package com.spring.json;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTestController {
	
	@GetMapping("/list1")
	@ResponseBody             
	public Map<String,String> list1() {
		Map<String,String> map = new HashMap<String, String>();
		
		//map , list는 인터페이스므로 생성을 못함
		//생성하기 위해선 map,list 구현체인 클래스들은 호출 해야함.
		
		map.put("name", "장순영");
		map.put("hp", "01012345678");
		map.put("addr","광교");
		
		return map;
		//어기 담긴 파일을 json으로 처리해서 브라우저로 띄울 떄
	}

}
