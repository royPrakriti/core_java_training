package objects;

public class Connecting_objects {
	int id;
	String name;
	
	public void study(){
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		Connecting_objects s = new Connecting_objects();
		System.out.println(s.id);
		System.out.println(s.name);
		s.study();
		
	}

}
