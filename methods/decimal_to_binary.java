package methods;

public class decimal_to_binary {
	public static int decimalToBinary(int number) {
	    int result = 0;
	    int position = 1;

	    while (number > 0) {
	        int digit = number % 2;
	        result = result + digit * position;
	        position = position * 10;
	        number = number / 2;
	    }

	    return result;
	}
    public static void main(String[] args) {
    	System.out.println(decimalToBinary(10)); 
	}

}
