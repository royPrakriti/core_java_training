package methods;

public class calculator_by_returntype {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
		
	}
	public static int mul(int a, int b) {
		return a * b;
	}
	public static int div(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		
		int a = 8, b = 9;
		char ch = '+';
		int res;
		
		switch(ch) {
		case '+':
			res = add(a,b);
			System.out.println(res);
			break;
			
		case '-':
			res = sub(a,b);
			System.out.println(res);
			break;
			
		case '*':
			res = mul(a,b);
			System.out.println(res);
			break;
			
		case '/':
			res = div(a,b);
			System.out.println(res);
			break;
			
		default:
			System.out.println("invalid");
			
			
		}
				
	
		
	}

}
