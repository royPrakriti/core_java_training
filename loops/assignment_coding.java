package loops;

public class assignment_coding {
	public static void main(String[] args) {
		
		//no of digits
		int n = 12900000;
		int sum = 0;
		
		while(n != 0) {
			int r = n % 10;
			n = n/10;
			sum += 1;
			
		}
		System.out.println(sum);
		
		//count even and odd
		int n1 = 129008900;
		int sum1 = 0;
		int odd = 0;
		int even = 0;
				
		
		while(n1 != 0) {
	
			int r = n1 % 10;
			n1 = n1/10;
			if (r % 2 != 0) {
				odd += 1;
			}else {
				even += 1;
			}
		}
		System.out.println(odd);
		System.out.println(even);
  
		
		//no of zeros
		
		
		int n4 = 12009;
		int count = 0;
		
		while(n4 != 0) {
			int r = n4 % 10;
			n4 = n4/10;
			if (r == 0) {
				count++;
			}
		
		}
		System.out.println(count);
		
		
		//avg of digits
		
		int n2 = 12009;
		int count1 = 0;
		int sum2 = 0;
		int avg = 0;
		
		while(n2 != 0) {
			int r1 = n2 % 10;
			n2 = n2/10;
			sum2 += r1;
			count1 += 1;
			
		
		}
		avg = sum1/count1;
		
		System.out.println(avg);
		
		
		//palindrome
		
		int n3 = 78987;
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

}
