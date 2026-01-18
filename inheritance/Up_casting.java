package inheritance;

public class Up_casting {
	
	public void m1() {
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		Up_casting p = c;// up casting (child to parent)
		p.m1();
		
		Child c2 = (Child)p;
		c2.m1();
		c2.m2();
	}

}


class Child extends Up_casting{
	
	public void m2() {
		System.out.println("parent");
	}
	
}
