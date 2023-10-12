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
		
		//map , list�� �������̽��Ƿ� ������ ����
		//�����ϱ� ���ؼ� map,list ����ü�� Ŭ�������� ȣ�� �ؾ���.
		
		map.put("name", "�����");
		map.put("hp", "01012345678");
		map.put("addr","����");
		
		return map;
		//��� ��� ������ json���� ó���ؼ� �������� ��� ��
	}

}
