package methods;

public class no_of_digits{
	public static void count(int n) {
		int count = 0;
		while(n > 0){
			int r = n % 10;
			n = n / 10;
			count += 1;
		}
		
		System.out.println(count);
	}
	public static void main(String[] args) {
		count(145);
		
	}

}
