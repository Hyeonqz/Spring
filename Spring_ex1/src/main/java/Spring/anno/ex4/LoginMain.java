package Spring.anno.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginMain {
	public static void main(String[] args) {
		
		ApplicationContext anno1 = new ClassPathXmlApplicationContext("annoContext4.xml");
		
		LogicController logic1 = (LogicController)anno1.getBean("logic");
		
		logic1.insert("annotation___practice");
		logic1.delete("1");
		
	}

}
