package Spring.anno.ex5;

import java.math.BigInteger;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myfruit")
public class MyFruit {
	
	@Resource(name="kfruit")
	
	//정확하게 bean의 이름을 주입해야한다.
	@Autowired
	Fruit fruit;
	
	public void writeFruit() {
		System.out.println("내가 좋아하는 과일은???");
		fruit.writeFruitName();
	}
	
}
