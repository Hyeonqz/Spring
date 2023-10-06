package Spring.anno.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("logic")
public class LogicController {
	
	@Autowired
	//��Ȯ�� ���� ���̵�� ����_��ȣ���� �ִ� ��쿣 annotation resource�� ����Ѵ�. @Resource(name="��Ȯ���̸�")
	DaoInter daoInter;
	// -> DaoInter�� ���� �ڵ� ������ ���� �� �ִ�.
	
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
