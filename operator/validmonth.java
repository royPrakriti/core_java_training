package operator;

import java.util.Scanner;

public class validmonth {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        String res = (num > 12)? "invalid month" : "valid month";
        System.out.println(res);
        
        
        
	}

}
