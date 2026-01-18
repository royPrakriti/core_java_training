package Super_keywork;

public class CHILD1 extends PARENT {
	long phone;
	
	public CHILD1(String name, long phone) {
		super(name);
		this.phone = phone;
	}
	
	public static void main(String[] args) {
		CHILD1 c = new CHILD1("Prakriti",3289380);
		System.out.println(c.name);
		System.out.println(c.phone);
		
		
	}

}
