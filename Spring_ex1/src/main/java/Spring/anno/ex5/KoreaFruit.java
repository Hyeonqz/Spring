package Spring.anno.ex5;

import org.springframework.stereotype.Component;

@Component("kfruit")
public class KoreaFruit implements Fruit {
	
	
	@Override
	public void writeFruitName() {
		System.out.println("한국 과일은 맛있다.");
		
	}

}
