package Spring.anno.ex6;

import org.springframework.stereotype.Component;

@Component("td")
public class TestDao {
	
	public void insert(String irum) {
		System.out.println(irum + " 님 DB에 추가함ㅋ");
	}
	
	public void delete(String no) {
		System.out.println(no + " 번 데이터 삭제됨");
	}
	
	public void select(String irum) {
		System.out.println("이름 : "+irum);
	}
}
