package methods;

public class return_good_if_palindrome {
	public static void return_good(int n) {
		int temp = n;
		
		int res = 0;
		while (n > 0) {
			int r  = n % 10;
			res = res * 10 + r;
			n = n/10;
			
		}
		
		
		if (res == temp){
			System.out.println("Good");
		}else {
			System.out.println("bad");
		}
		
	}	
	public static void main(String[] args) {
		return_good(970);
	}

}
