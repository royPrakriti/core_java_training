package loops;

public class for_loop {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1; i <= n; i++) {
			System.out.println("java");
		}
		
		int n1 = 30;
		int count = 0;
		for (int i = 1; i <= 30;i ++) {
			if (n1 % i == 0) {
				count += 1;
						
			}
			
		}
		System.out.println(count);
		
		if (count == 2) {
		    System.out.println("Prime number");
		} else {
		    System.out.println("Not a prime number");
		}
		
		
	}

}
