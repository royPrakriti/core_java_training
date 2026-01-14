package static_variable;

public class static_block {
	static {
		int a = 10;
		System.out.println(a);
		System.out.println("xyz");
	}
	
	static {
		System.out.println("SB2");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
	
	static {
		System.out.println("SB3");
	}

}
