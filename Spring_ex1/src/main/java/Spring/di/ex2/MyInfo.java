package Spring.di.ex2;

public class MyInfo {
	
	String name;
	String age;
	String addr;
	
	
	public void MYInfo(String name, String age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "MyInfo[name="+name+", age="+age+", addr="+addr+"]";
	}
}
