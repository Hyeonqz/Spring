package Spring.anno.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ex6Main {

	public ex6Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("annoContext4.xml");
		
		MysqlController mc = (MysqlController)context.getBean("mysqlc");
		mc.insert("ȫ����");
		mc.delete("5");
		mc.select("ȫ����");

	}

}
