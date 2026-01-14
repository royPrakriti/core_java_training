package constructor;

public class constructor_overloading {
	int id;
	String name;
	
	public constructor_overloading() {
		System.out.println("constructor");
		
	}
	
	public constructor_overloading (int id,String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		constructor_overloading s1 = new constructor_overloading();
		s1.display();
		constructor_overloading s2= new constructor_overloading();
		s2.display();
	}

}
