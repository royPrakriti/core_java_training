package methods;

public class xylem_no {
	public static boolean true_false(int n) {
		int last = n % 10;   
	    int sum1 = last;     
	    int sum2 = 0;
	     n = n/10;
	    
	    while (n > 9) {
	    	int r = n % 10;
	    	sum2 = sum2 + r;
	    	n = n/10;
	    }
	    
	    sum1 = sum1 + n;
	    
	    return sum1 == sum2;
	}
	public static void main(String[] args) {
		System.out.println(true_false(1234));
	}

}
