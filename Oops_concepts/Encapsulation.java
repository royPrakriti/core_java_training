package Oops_concepts;

public class Encapsulation {
	
	String name;
	private int pass;
	
	public int getpass() {
		return pass;
	}
	
	public void setpass(int pass) {
		this.pass = pass;
	}
	
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.name = "Prakriti";
		e.setpass(1234);
		System.out.println(e.getpass());
		
	}
	
	

}
