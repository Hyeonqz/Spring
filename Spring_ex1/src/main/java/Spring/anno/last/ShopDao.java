package Spring.anno.last;

public class ShopDao implements ShopInter {

	@Override
	public void insertSangpum(String a, int b, String c) {
		System.out.println(a  + b + c);
	}

	@Override
	public void deleteSangpum(String no) {
		System.out.println(no + " 번 상품 삭제함");

	}

	@Override
	public void selectSangpum(String a, int b, String c) {
		System.out.println("***상품 출력***");
		System.out.println("상품이름 : " + a);
		System.out.println("상품가격 : " + b);
		System.out.println("색깔 : " + c);

	}

}
