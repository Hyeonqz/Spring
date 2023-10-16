package spring.mvc.friday;

import java.util.List;
import java.util.Map;

public interface InfoInter {
	
	//추상메서드만 구현 한다.
	//인터페이스만 어차피 추상매체라 abstract를 안써두 된다
	public int getTotalCount();
	
	public void insertMyInfo(InfoDto dto);
	
	//public List<InfoDto> getAllInfos();
	
	//num값 가져오기
	public InfoDto getNum(String num);
	
	//삭제
	public void deleteMyInfo(String num);
	
	//수정
	public void updateMyInfo(InfoDto dto);
	
	public List<InfoDto> getAllInfos(Map<String,String> map);
}
