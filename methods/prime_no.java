package methods;

public class prime_no {
	
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0;i<= n/2;i++) {
			if (n%i == 0){
				System.out.println("not prime");
				return;
			}
				
		}
		System.out.println("prime no");
	}
	
	
	

}
