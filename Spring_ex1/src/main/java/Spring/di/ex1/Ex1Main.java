package Spring.di.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1Main {
	public static void main(String[] args) {
		
		System.out.println("자바를 잘해야 한다 진짜....(자바 방식으로 해보기)");
		
		MessageInter m1 = new Message1();
		MessageInter m2 = new Message2();
		
		m1.sayHello("ㅎㅇ");
		m2.sayHello("hihi");
			
		System.out.println();
		System.out.println("스프링 방식으로 해보기");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext1.xml"); //xml파일을 넣어줘야함 resoruces에 있는.
		
		//#방법1
		MessageInter m3 = (Message1)context.getBean("mesBean1");
		m3.sayHello("성신");
		
		//#방법2
		MessageInter m4 = context.getBean("mesBean2",Message2.class);
		m4.sayHello("성현");
	}
}
