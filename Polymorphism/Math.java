package Polymorphism;

public class Math {
	
	public static void add(int a,int b) {
		System.out.println("2 type");
		System.out.println(a + b);
	}
	
	public static void add(int a,int b,int c) {
		System.out.println("3 type");
		System.out.println(a+b+c);
		
	}
	
	public static void add(float a,float b) {
		System.out.println("2 float type");
		System.out.println(a+b);
		
	}
	
	public static void add(double a,double b) {
		System.out.println("2 double type");
		System.out.println(a+b);
		
	}
	
	public static int add(int c,int d,int e,int f) {
		System.out.println("4 type");
		return (c+d + e + f);
	}
	
	public void add(int a, int b, int c, int d, int f) {
		
		System.out.println("2 double type");
		System.out.println(a+b+c+d+f);
		
	}
	
	public static void main(String[] args) {
		add(2, 3);
		add(2, 5, 6);
		add(2.4f, 3.5f);
		add(4.6d,7.8d); 
		add(6.4, 7.8); // Any decimal values will be initiated as double 
		
		int result = add(4,5,6,7);
		
		Math m = new Math();
		m.add(2, 5,6,6,5);
		
	}

}
