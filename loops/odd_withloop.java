package loops;

public class odd_withloop {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 10) {
			if (a % 2 != 0){
				System.out.println(a);
				
			}
			a++;
		}
		int b = 10;
		while (b >= 1) {
			if (b % 2 != 0){
				System.out.println(b);
				
			}
			b--;
		}
	}

}
