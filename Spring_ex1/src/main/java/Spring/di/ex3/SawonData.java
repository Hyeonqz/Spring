package Spring.di.ex3;

public class SawonData {
	
	private String sawonname;
	private int pay;
	private String ipsaday;
	
	public SawonData() {
		
	}
	
	//생성자 주입
	public SawonData(String name) {
		sawonname = name;

	}
	
	//setter 주입
	
	public int getPay() {
		return pay;
	}

	public String getSawonname() {
		return sawonname;
	}

	public void setSawonname(String sawonname) {
		this.sawonname = sawonname;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getIpsaday() {
		return ipsaday;
	}

	public void setIpsaday(String ipsaday) {
		this.ipsaday = ipsaday;
	}
	
	
	

}
