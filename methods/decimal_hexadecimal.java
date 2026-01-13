package methods;

public class decimal_hexadecimal {
	public static String decimalToHexadecimal(int number) {
	    String result = "";

	    while (number > 0) {
	        int digit = number % 16;

	        if (digit < 10) {
	            result = digit + result;
	        } else {
	            char ch = (char) (digit + 55);
	            result = ch + result;
	        }

	        number = number / 16;
	    }

	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(decimalToHexadecimal(255));
	}


}
