package Spring.anno.ex5;

import org.springframework.stereotype.Component;

@Component("tfruit")
public class ThailandFruit implements Fruit {

	@Override
	public void writeFruitName() {
		System.out.println("태국하면 파파야지..");
	}

}
