package core_java;

public class Demo {
	public static void main(String[] args) {
		int a = 10;
		long b = a;
		System.out.println(b); //widening
		
		long c = 20;
		int d = (int) c;
		System.out.println(d); //narrowing
		
		double d1 = 55.55;
		int i1 = (int)d1;
		System.out.println(i1); //narrowing //dataloss
		
		byte b1 = 5;
		float b2 = b1;
		System.out.println(b2);
		
		float b3 = 6.0f;
		int b4 = (int) b3;
		System.out.println(b4);
		
		char c1='A';
		int i = c1;
		System.out.println(i);
		
		
	
	}

}
