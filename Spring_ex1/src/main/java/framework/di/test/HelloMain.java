package framework.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		System.out.println("hello 메서드 호출하기");
		
		Hello hello = new Hello();
		
		System.out.println(hello.getMsg());
		
		Hello hello2 = new Hello(); //new로 생성시 새로운 주소에 할당 된다.
		System.out.println(hello2.getMsg());
		
		System.out.println(hello==hello2);
		System.out.println(hello.equals(hello2));
		
		System.out.println("Spring 방식으로 메서드 호출하기");
		//xml파일 가져오기. 웹으로 실행시 web.xml로 설정 되있음.
		
		ApplicationContext app1 = new ClassPathXmlApplicationContext("helloContext.xml");
		
		//hello 객체 생성 , 방법1
		Hello h1 = (Hello)app1.getBean("hello");
		System.out.println(h1.getMsg());
		
		//방법2
		Hello h2 = app1.getBean("hello",Hello.class);
		System.out.println(h2.getMsg());
		
		System.out.println(h1==h2); //생성주는 같다. 
	}

}
