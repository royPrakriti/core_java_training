package Polymorphism;

public class Greatest {
	
	public void max(int a, int b) {
		int ans = (a > b)?a : b;
		System.out.println(ans);
		
	}
	
	public void max(int a, int b,int c) {
		int ans = (a > b && a > c) ? a :((b > c)? b : c);
		System.out.println(ans +"is the greatest");
				
	}
	
	public void max(int a, Float b) {
		Float ans = (a > b)?a:b;
		System.out.println(ans);
		
	}
	
	public void max(float a, float b) {
		Float ans = (a > b)?a:b;
		System.out.println(ans);
		
	}
	
	public static void main(String[] args) {
		Greatest g = new Greatest();
		g.max(2, 9);
		g.max(2, 4, 6);
		g.max(2, 8.9f);
		g.max(6.7f, 6.5f);
	}

}
