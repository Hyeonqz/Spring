package com.spring.json;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTest2Controller {
	
	@GetMapping("/list2")
	@ResponseBody
	public Map<String,String> ex2() {
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("sang","Ãà±¸°ø");
		map.put("price", "30000");
		map.put("color", "white");
		
		return map;
	}

}
