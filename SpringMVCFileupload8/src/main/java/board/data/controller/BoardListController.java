package board.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.reboard.BoardDaoInter;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardListController {
	
	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/list")
	public ModelAndView goreboard(
			@RequestParam(value="currentPage",defaultValue = "1") int currentPage) {
		ModelAndView mv= new ModelAndView();
		
		int totalCount = dao.getTotalCount();
		
		//����¡ ó�� �ʿ��� ���� ����
		int totalPage; //�� ��������
		int startPage; //�������� ������ ����������
		int endPage; //�������� ������ ��������
		int startNum; //db���� ������ ���� ���۹�ȣ(mysql�� ù���� 0,����Ŭ�� 1)
		int perPage=6; //���������� ������ ���� ����
		int perBlock=10; //�Ѻ��� ������ ������ ����

		//���������� �б�(�� null�ϰ��� 1���̷� �ش�)����� �ؾ��ϹǷ� int�� ����ȯ����
		//if(("currentPage")==null)
		 //	currentPage=1;
		//else
			//currentPage=Integer.parseInt(("currentPage"));
		     
		     
		//���������� ���ϱ�
		//�ѱ��� ����/���������� ������ ������ ����(7/5=1)
		//�������� 1�̶� ������ ������ 1������ �߰�(1+1=2�������� �ʿ�)
		totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);
		 
		//������ �������� ����������
		//perBlock=5�ϰ��� ���������� 1~5 ����:1 ��:5
		//���������� 13  ����:11  ��:15
		startPage=(currentPage-1)/perBlock*perBlock+1;
		     
		endPage=startPage+perBlock-1;
		    
		 // ���������� 23�ϰ�� ���������� 25���ƴ϶� 23�̴�   
		     if(endPage>totalPage)
		        	endPage=totalPage;
		     
			//������������ ������ ���۹�ȣ
			//1������: 0,2������:5 3������:10....
			startNum=(currentPage-1)*perPage;
			
		
			//�� ���������� �ʿ��� �Խñ� �������� == ������ �۸� ��������
			//���������� ����� ���۹�ȣ ���ϱ� no
			//�ѱ۰����� 23�̸� 1������ 23,2�������� 18,3������ 13.....
			//��½� 1�� �����ϸ� ���	
			List<BoardDto> list = dao.getPagingList(startNum, perPage);

			//�� �������� ����� ���۹�ȣ
			int no = totalCount-(currentPage-1)*perPage;
		
		mv.addObject("totalCount",totalCount);
		mv.addObject("list",list);
		mv.addObject("startPage",startPage);
		mv.addObject("totalPage",totalPage);
		mv.addObject("endPage",endPage);
		mv.addObject("no",no);
		mv.addObject("currentPage",currentPage);
		
		mv.setViewName("reboard/boardList");
		
		return mv;
	}
}
