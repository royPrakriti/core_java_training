package operator;
import java.util.*;

public class divisibleby3or5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        String res = ((num % 3 == 0) && (num%5 == 0))?"divisible by 3 and 5":"not divisible";
        System.out.println(res);
	}

}
