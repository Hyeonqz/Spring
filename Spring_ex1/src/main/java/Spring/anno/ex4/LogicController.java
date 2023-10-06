package Spring.anno.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("logic")
public class LogicController {
	
	@Autowired
	//정확한 빈의 아이디로 주입_모호성이 있는 경우엔 annotation resource를 사용한다. @Resource(name="정확한이름")
	DaoInter daoInter;
	// -> DaoInter의 값을 자동 주입을 받을 수 있다.
	
	public LogicController(MyDao dao) {
		this.daoInter =dao;
	}
	
	//insert
	public void insert(String str) {
		daoInter.insertData(str);
	}
	
	//delete
	public void delete(String num) {
		daoInter.deleteData(num);
	}
	
}
