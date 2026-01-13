package methods;

public class strong_no {
	public static int factorial(int r) {
        int fact = 1;
        for (int i = 1; i <= r; i++) {
            fact = fact * i;
        }
        return fact;
    }
	
	public static boolean strong(int n) {
		int res = 0;
		int temp = n;
	
	
		while (n > 0) {
			int r = n % 10;
			res = res + factorial(r);
			n = n/10;
		}
		
		if (res == temp) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean res = strong(123);
		System.out.println(res);
	}
}
