package loops;

public class Sum_1_to_N {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		int n = 6;
		while(i <= n) {
			sum += i;
			i++;
			
		}
		
		System.out.println(sum);
		
		
		do {
			sum += i;
			i++;
		}while(i <= n);
		
		System.out.println(sum);
			
				
	}

}
