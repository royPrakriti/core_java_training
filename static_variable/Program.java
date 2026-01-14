package static_variable;

public class Program {
	public static void ispalindrome(int n3){
		int temp = n3;
		int rev = 0;
		
		while(n3 != 0) {
			int r1 = n3 % 10;
			
			rev = rev * 10 + r1;
			
			n3 = n3/10;
		}
		
		if (rev == temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
	}
	
	public static void isprime(int n) {
		int count = 0;
		for(int i = 1;i <= n;i++) {
			if (n % i == 0) {
				count++;
			}
			
		}
		if (count == 2) {
			System.out.println(n +"is prime");
		}else {
			System.out.println(n + "is not prime");
		}
	}


}
