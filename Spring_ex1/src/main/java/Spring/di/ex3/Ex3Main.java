package Spring.di.ex3;

import java.text.Format;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//di주입 * xml등록 필수

public class Ex3Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext3.xml");
		
		//SawonData
		SawonData sd = (SawonData)context.getBean("sawon");
		
		System.out.println(sd.toString());
		System.out.println(String.valueOf(sd));
		System.out.println(sd);
		
		//Sawon
		Sawon sawon = (Sawon)context.getBean("sawon1");
		sawon.outputData();
		
		System.out.println();
	}
}
