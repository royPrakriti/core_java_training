package methods;

public class binary_to_decimal {
	public static int binaryToDecimal(int number) {
	    int result = 0;
	    int base = 1;

	    while (number > 0) {
	        int digit = number % 10;
	        result = result + digit * base;
	        base = base * 2;
	        number = number / 10;
	    }

	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(binaryToDecimal(1010));
	}


}
