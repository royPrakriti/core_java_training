package operator;
import java.util.*;

public class calculator_by_switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.print("Choose (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;
                
            case '*':
            	System.out.println(a * b);
            	break;
            	
            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid");
        }
	}

}
