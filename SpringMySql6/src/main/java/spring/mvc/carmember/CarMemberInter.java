package spring.mvc.carmember;

import java.util.List;

import spring.mysql.mycar.MyCarDto;

public interface CarMemberInter {
	
	 public int getTotalCount();
	 
	 public void insert(CarMemberDto cdto); 
	 
	 public List<CarMemberDto> getListData();
	 
		
		  public CarMemberDto getNum(String num);
		  
		  public String delete(String num);
		  
		  public void update(CarMemberDto cdto);
		 
	
}
