package Spring.di.ex2;

public class Person {
	
	String Schoolname;
	MyInfo info;
	String age;
	String addr;
	
	public Person(MyInfo info) {
		super();
		this.info = info;
	}

	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}
	
	//출력
	public void writeData() {
		
		System.out.println("학교 정보 출력");
		System.out.println("학교명 : " + Schoolname);
		System.out.println("학생 이름 : " + info.name);
		System.out.println("학생 나이 : " + info.age);
		System.out.println("학생 주소 : " + info.addr);
	}
	
	
	

}
