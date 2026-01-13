package methods;
import java.util.*;

public class power_by_methods {
	
	public static void baseandpower(int a,int b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 no:");
		a = sc.nextInt();
		b = sc.nextInt();
		int res = 1;
				
		
		while (b > 0) {
			res = res * a;
			b--;
			
			
		}
		System.out.println(res);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		baseandpower(12,2);
		
		
	}


}
