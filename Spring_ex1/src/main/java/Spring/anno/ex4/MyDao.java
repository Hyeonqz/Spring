package Spring.anno.ex4;

import org.springframework.stereotype.Component;

@Component //자동으로bean에 등록이 된다.(id는 클래스명, 단 첫글자만 소문자 즉 myDao가 아이디가됨) -> logicController이 딤.
public class MyDao implements DaoInter {

	@Override
	public void insertData(String str) {
		System.out.println(str + "_str데이터 db에 추가성공!!!");

	}

	@Override
	public void deleteData(String num) {
		System.out.println(num + "_num에 해당하는 데이터 삭제 성공!!!");

	}

}
