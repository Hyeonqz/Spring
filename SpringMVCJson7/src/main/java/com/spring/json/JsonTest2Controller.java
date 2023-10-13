package com.spring.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
	
	@GetMapping("/list4")
	public Map<String,Object> list4(@RequestParam String name) {
		
		List<PhotoDto> list = new ArrayList<PhotoDto>();
		
		list.add(new PhotoDto("1ÄõÄ«", "q1.jpg"));
		list.add(new PhotoDto("2ÄõÄ«", "q2.jpg"));
		list.add(new PhotoDto("3ÄõÄ«", "q3.jpg"));
		list.add(new PhotoDto("4ÄõÄ«", "q4.jpg"));
		list.add(new PhotoDto("5ÄõÄ«", "q5.jpg"));
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "¾ø´Â ¸Þ´º ÀÔ´Ï´Ù");
		map.put("photo", "noimage.JPG");
		
		for(PhotoDto dto : list) {
			
			if(name.equals(dto.getName())) {
				map.put("name", dto.getName());
				map.put("photo",dto.getPhoto());
				
			} 
		}
		return map;
	}

}
