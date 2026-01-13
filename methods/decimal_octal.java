package methods;

public class decimal_octal {
	public static int decimalToOctal(int number) {
	    int result = 0;
	    int position = 1;

	    while (number > 0) {
	        int digit = number % 8;
	        result = result + digit * position;
	        position = position * 10;
	        number = number / 8;
	    }

	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(decimalToOctal(10));
	}


}
