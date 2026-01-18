package Polymorphism;

public class child extends Parent {
	@Override
	
	public void home() {
		System.out.println("Red");
	}
	
	public void bike() {
		System.out.println("BMW");
		
	}
	
	public static void main(String[] args) {
		
		Parent P = new Parent();
	    P.home();          // blue

	    child c = new child();
	    c.home();          // Red
	    c.bike();          // BMW

	    Parent p2 = new child();   // 🔥 polymorphism happens HERE
	    p2.home();
		
		
		
	}

}
