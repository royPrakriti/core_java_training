package loops;

public class sum_of_the_digits_while {
	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		
		while(n != 0) {
			int r = n % 10;
			n = n/10;
			sum = sum + r;
			
		}
		System.out.println(sum);
	}

}
