package operator;

import java.util.*;

public class singleordouble {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String res = (num > 9 && num <100)?"double":"single";
		System.out.println(res);
		
	}

}
