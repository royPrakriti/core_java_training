package operator;
import java.util.*;

public class capitaltosmallvice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
		    ch = (char)(ch + 32);
		}else {
			ch = (char)(ch - 32);
		}
		
		System.out.println(ch);
	}

}
