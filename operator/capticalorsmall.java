package operator;
import java.util.*;

public class capticalorsmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter an char: ");
	    char num = sc.next().charAt(0);
		
	    if (num >= 'A' && num<='Z') {
	    	System.out.println("capital");
	    	}
	    else {
	    	System.out.println("small");
	    }
		
	}
	
	

}
