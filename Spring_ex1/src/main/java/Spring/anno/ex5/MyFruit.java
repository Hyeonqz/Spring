package Spring.anno.ex5;

import java.math.BigInteger;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myfruit")
public class MyFruit {
	
	@Resource(name="kfruit")
	
	//��Ȯ�ϰ� bean�� �̸��� �����ؾ��Ѵ�.
	@Autowired
	Fruit fruit;
	
	public void writeFruit() {
		System.out.println("���� �����ϴ� ������???");
		fruit.writeFruitName();
	}
	
}
