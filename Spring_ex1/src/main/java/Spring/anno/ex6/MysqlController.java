package Spring.anno.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mysqlc")
public class MysqlController {
	
	@Autowired
	TestDao tdao;
	
	public MysqlController(TestDao tdao) {
		this.tdao = tdao;
	}
	
	public void insert(String irum) {
		tdao.insert(irum);
	}
	
	public void delete(String num) {
		tdao.delete(num);
	}
	
	public void select(String irum) {
		tdao.select(irum);
	}

}
