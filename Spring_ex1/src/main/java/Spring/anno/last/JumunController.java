package Spring.anno.last;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JumunController {
	
	@Autowired	//shopinter dao아무거나 막 쓸 수 있음. autuowired하면
	ShopInter shopinter;
	
	int cnt=10;
	String name="홍성경";
	
	public void insertJumun(String sang, int price, String color) {
	}
}
