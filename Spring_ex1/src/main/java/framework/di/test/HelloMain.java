package framework.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		System.out.println("hello �޼��� ȣ���ϱ�");
		
		Hello hello = new Hello();
		
		System.out.println(hello.getMsg());
		
		Hello hello2 = new Hello(); //new�� ������ ���ο� �ּҿ� �Ҵ� �ȴ�.
		System.out.println(hello2.getMsg());
		
		System.out.println(hello==hello2);
		System.out.println(hello.equals(hello2));
		
		System.out.println("Spring ������� �޼��� ȣ���ϱ�");
		//xml���� ��������. ������ ����� web.xml�� ���� ������.
		
		ApplicationContext app1 = new ClassPathXmlApplicationContext("helloContext.xml");
		
		//hello ��ü ���� , ���1
		Hello h1 = (Hello)app1.getBean("hello");
		System.out.println(h1.getMsg());
		
		//���2
		Hello h2 = app1.getBean("hello",Hello.class);
		System.out.println(h2.getMsg());
		
		System.out.println(h1==h2); //�����ִ� ����. 
	}

}
