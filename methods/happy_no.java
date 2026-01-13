package methods;

public class happy_no {
	public static boolean isHappy(int n) {

	    while (n != 1 && n != 4) {
	        int sum = 0;

	        while (n > 0) {
	            int r = n % 10;
	            sum = sum + r * r;
	            n = n / 10;
	        }

	        n = sum;
	    }

	    return n == 1;
	}
	
	public static void main(String[] args) {
		System.out.println(isHappy(45));
		
	}

}
