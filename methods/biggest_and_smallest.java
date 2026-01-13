package methods;

public class biggest_and_smallest {
	public static void greatest(int a, int b,int c) {
		int res = (a>b && a >c)? a:(b>c ? b:c);
		System.out.println(res);
	}
	public static void main(String[] args) {
		greatest(7,40,56);
		
	}

}
