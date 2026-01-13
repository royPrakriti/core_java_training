package methods;

public class count_of_even_and_odd {
	public static boolean count_even_odd(int n) {
		int even_count = 0;
		int odd_count = 0;
		
		while (n > 0) {
			int r = n % 10;
			if (r % 2 == 0) {
				even_count++;
				
			}else {
				odd_count++;
			}
			n = n / 10;
			
		}
		
		if (even_count == odd_count) {
			return true;
		} else {
			return false;
		}
		
		
		
		
		
		
				
	}
	
	public static void main(String[] args) {
		
		boolean result = count_even_odd(14739);
        System.out.println(result);
		
	}

}
