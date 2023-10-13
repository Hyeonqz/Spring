package com.spring.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTestController {
	
	@GetMapping("/list1")
	@ResponseBody      //��� ��� ������ json���� ó���ؼ� �������� ��� �� responsebody ���
	public Map<String,String> list1() {
		Map<String,String> map = new HashMap<String, String>();
		
		//map , list�� �������̽��Ƿ� ������ ����
		//�����ϱ� ���ؼ� map,list ����ü�� Ŭ�������� ȣ�� �ؾ���.
		
		map.put("name", "�����");
		map.put("hp", "01012345678");
		map.put("addr","����");
		
		return map;
		
	}
	
	@GetMapping("/list3")
	public @ResponseBody List<PhotoDto> list3() {
		List<PhotoDto> list = new ArrayList<PhotoDto>();
		
		list.add(new PhotoDto("1��ī", "q1.jpg"));
		list.add(new PhotoDto("2��ī", "q2.jpg"));
		list.add(new PhotoDto("3��ī", "q3.jpg"));
		list.add(new PhotoDto("4��ī", "q4.jpg"));
		list.add(new PhotoDto("5��ī", "q5.jpg"));
			
		return list;
	}
}
