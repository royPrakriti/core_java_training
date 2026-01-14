package display;

public class display_this_method {

		int id;
		String name;
		public void initialize(int id,String name) {
			this.id=id;
			this.name=name;
		}
		public void display() {
			System.out.println(id);
			System.out.println(name);
		}
		public void m1() {
			int id=200;
			System.out.println(id); //local
			System.out.println(this.id); //non-static
		}
		public static void main(String[] args) {
			display_this_method s =new display_this_method();
			s.display();
			s.initialize(10,"XYZ");
			s.display();
		}

}


