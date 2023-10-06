package Spring.di.ex3;

public class Sawon {
	SawonData data = new SawonData();
	
	public Sawon(SawonData data) {
		this.data = data;
	}
	
	public void outputData() {
		System.out.println("---사원정보---");
		System.out.println("사원이름 : " + data.getSawonname());
		System.out.println("급여 : " + data.getPay());
		System.out.println("입사일 : " + data.getIpsaday());
	}

}
